package com.example.juegocolores

/*
    Autor: Joshua David Ortiz Rosas
    Curso: Programacion De Dispositivos Moviles
    Semestre: VI
    Fecha: 26/09/2025
    Ultima modificacion: 18/10/2025
*/

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment

// Actividad principal que contiene el NavHostFragment para manejar la navegación
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asocia la vista principal con el layout activity_main.xml
        setContentView(R.layout.activity_main)
    }
}
