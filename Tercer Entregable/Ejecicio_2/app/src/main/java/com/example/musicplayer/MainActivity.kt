/*
    Autor: Joshua david Ortiz Rosas
    Curso: Programacion De Dispositivos Moviles
    Semestre: VI
    Fecha: 05/09/2025
    Ultima modificacion: 07/09/2025
*/

package com.example.musicplayer

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    private var isPaused: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay: Button = findViewById(R.id.btnPlay)
        val btnPause: Button = findViewById(R.id.btnPause)
        val btnStop: Button = findViewById(R.id.btnStop)

        // Botón Reproducir
        btnPlay.setOnClickListener {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(this, R.raw.mimusica)
                mediaPlayer?.setOnCompletionListener {
                    stopMusic() // Reinicia al terminar
                }
            }

            if (isPaused) {
                mediaPlayer?.start()
                isPaused = false
            } else {
                mediaPlayer?.start()
            }
        }

        // Botón Pausar
        btnPause.setOnClickListener {
            if (mediaPlayer?.isPlaying == true) {
                mediaPlayer?.pause()
                isPaused = true
            }
        }

        // Botón Detener
        btnStop.setOnClickListener {
            stopMusic()
        }
    }

    private fun stopMusic() {
        mediaPlayer?.release()
        mediaPlayer = null
        isPaused = false
    }

    override fun onDestroy() {
        super.onDestroy()
        stopMusic()
    }
}