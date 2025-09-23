/**
 * Descripción: Actividad principal que permite al usuario escribir una nota y enviarla a otra actividad.
 * Autor: [Joshua David Ortiz Rosas]
 * Fecha creación: 20/09/2025
 * Última modificación: 23/09/2025
 */

package com.example.editorapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class EditorActivity : AppCompatActivity() {

    // Declaramos el EditText donde el usuario escribe su nota
    private lateinit var editTextNota: EditText

    // Declaramos el botón para compartir la nota
    private lateinit var btnCompartir: Button

    // Clave usada para guardar el texto en rotación de pantalla
    private val CLAVE_NOTA = "nota_guardada"

    // Configuramos un launcher para recibir el resultado desde OpcionesActivity
    private val opcionesLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        // Si el resultado fue OK
        if (result.resultCode == Activity.RESULT_OK) {
            // Recuperamos el intent devuelto
            val data = result.data
            // Obtenemos el texto de la nota devuelta
            val textoDevuelto = data?.getStringExtra("nota_editada")
            // Si hay texto, lo ponemos de nuevo en el EditText
            if (!textoDevuelto.isNullOrEmpty()) {
                editTextNota.setText(textoDevuelto)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Cargamos el layout de esta actividad
        setContentView(R.layout.activity_editor)

        // Vinculamos las vistas del XML con variables
        editTextNota = findViewById(R.id.editTextNota)
        btnCompartir = findViewById(R.id.btnCompartir)

        // Si la actividad se reinicia (ej. rotación), restauramos el texto
        if (savedInstanceState != null) {
            val notaGuardada = savedInstanceState.getString(CLAVE_NOTA, "")
            editTextNota.setText(notaGuardada)
        }

        // Configuramos el botón "Compartir"
        btnCompartir.setOnClickListener {
            val texto = editTextNota.text.toString()
            // Solo enviar si el texto no está vacío
            if (texto.isNotEmpty()) {
                // Creamos un Intent para abrir OpcionesActivity
                val intent = Intent(this, OpcionesActivity::class.java)
                // Mandamos la nota en el intent
                intent.putExtra("nota", texto)
                // Abrimos la segunda actividad esperando resultado
                opcionesLauncher.launch(intent)
            }
        }
    }

    // Guardamos la nota si el usuario rota la pantalla
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(CLAVE_NOTA, editTextNota.text.toString())
    }
}
