package com.example.juegocolores.util

import android.graphics.Color
import kotlin.random.Random

// Clase de datos que representa un color con su nombre y valor hexadecimal
data class ColorItem(val name: String, val colorInt: Int)

// Objeto utilitario que gestiona los colores del juego
object ColorUtils {
    // Lista de colores disponibles
    val COLORS = listOf(
        ColorItem("Rojo", Color.parseColor("#D32F2F")),
        ColorItem("Verde", Color.parseColor("#388E3C")),
        ColorItem("Azul", Color.parseColor("#1976D2")),
        ColorItem("Amarillo", Color.parseColor("#FBC02D")),
        ColorItem("Morado", Color.parseColor("#7B1FA2"))
    )

    // Devuelve un color aleatorio de la lista
    fun randomColor(): ColorItem = COLORS[Random.nextInt(COLORS.size)]
}
