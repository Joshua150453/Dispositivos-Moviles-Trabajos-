/**
 * Descripción: Segunda actividad que recibe la nota y ofrece opciones de compartir o volver a editar.
 * Autor: [Joshua David Ortiz Rosas]
 * Fecha creación: 20/09/2025
 * Última modificación: 23/09/2025
 */

package com.example.editorapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OpcionesActivity : AppCompatActivity() {

    // Texto donde mostramos la nota recibida
    private lateinit var txtNotaRecibida: TextView

    // Botón para "Compartir por correo"
    private lateinit var btnCorreo: Button

    // Botón para "Editar de nuevo"
    private lateinit var btnEditar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Cargamos el layout de esta actividad
        setContentView(R.layout.activity_opciones)

        // Vinculamos las vistas del XML
        txtNotaRecibida = findViewById(R.id.txtNotaRecibida)
        btnCorreo = findViewById(R.id.btnCorreo)
        btnEditar = findViewById(R.id.btnEditar)

        // Recuperamos la nota enviada desde EditorActivity
        val notaRecibida = intent.getStringExtra("nota") ?: ""
        txtNotaRecibida.text = notaRecibida

        // Acción del botón "Compartir por correo"
        btnCorreo.setOnClickListener {
            // Aquí podríamos abrir un cliente de correo real, pero usamos un Toast
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
        }

        // Acción del botón "Editar de nuevo"
        btnEditar.setOnClickListener {
            // Preparamos un intent para devolver la nota a EditorActivity
            val data = Intent()
            data.putExtra("nota_editada", notaRecibida)
            // Mandamos el resultado OK
            setResult(Activity.RESULT_OK, data)
            // Cerramos esta actividad
            finish()
        }
    }
}
