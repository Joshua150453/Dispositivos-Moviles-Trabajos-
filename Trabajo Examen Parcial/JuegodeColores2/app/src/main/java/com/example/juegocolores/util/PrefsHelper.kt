package com.example.juegocolores.util

import android.content.Context

// Clase auxiliar para guardar y recuperar datos usando SharedPreferences
class PrefsHelper(context: Context) {
    private val prefs = context.getSharedPreferences("juego_prefs", Context.MODE_PRIVATE)

    // Guarda el puntaje más alto si supera al actual
    fun saveHighScore(value: Int) {
        val current = prefs.getInt("high_score", 0)
        if (value > current) prefs.edit().putInt("high_score", value).apply()
    }

    // Devuelve el puntaje más alto guardado
    fun getHighScore(): Int = prefs.getInt("high_score", 0)
}
