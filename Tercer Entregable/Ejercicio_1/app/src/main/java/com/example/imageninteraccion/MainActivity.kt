/*
    Autor: Joshua david Ortiz Rosas
    Curso: Programacion De Dispositivos Moviles
    Semestre: VI
    Fecha: 05/09/2025
    Ultima modificacion: 07/09/2025
*/

package com.example.imageninteraccion

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagen = findViewById<ImageView>(R.id.myImage)
        imagen.setOnClickListener {
            Toast.makeText(this, "¡Has hecho clic en la imagen!", Toast.LENGTH_SHORT).show()
        }
    }
}