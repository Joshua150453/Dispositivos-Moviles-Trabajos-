package com.example.juegocolores.viewmodel

import android.os.CountDownTimer
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// ViewModel que maneja la lógica del juego (puntaje, tiempo y estado)
class GameViewModel : ViewModel() {
    private val initialTimeMs = 30_000L // Duración inicial del juego (30 segundos)

    // LiveData para el puntaje actual
    private val _score = MutableLiveData(0)
    val score: LiveData<Int> = _score

    // LiveData para el tiempo restante
    private val _timeLeft = MutableLiveData(initialTimeMs)
    val timeLeft: LiveData<Long> = _timeLeft

    // LiveData para saber si el juego está corriendo
    private val _isRunning = MutableLiveData(false)
    val isRunning: LiveData<Boolean> = _isRunning

    private var timer: CountDownTimer? = null

    // Incrementa el puntaje en 1
    fun incrementScore() { _score.value = (_score.value ?: 0) + 1 }

    // Reinicia el puntaje
    fun resetScore() { _score.value = 0 }

    // Inicia el temporizador del juego
    fun startTimer(onFinish: () -> Unit) {
        timer?.cancel()
        _isRunning.value = true
        timer = object : CountDownTimer(_timeLeft.value ?: initialTimeMs, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                _timeLeft.value = millisUntilFinished
            }
            override fun onFinish() {
                _timeLeft.value = 0L
                _isRunning.value = false
                onFinish() // Ejecuta acción al finalizar el tiempo
            }
        }.start()
    }

    // Cancela el temporizador
    fun cancelTimer() {
        timer?.cancel()
        _isRunning.value = false
    }

    // Reinicia el tiempo sin iniciar el contador
    fun resetTimer() {
        timer?.cancel()
        _timeLeft.value = initialTimeMs
        _isRunning.value = false
    }
}

