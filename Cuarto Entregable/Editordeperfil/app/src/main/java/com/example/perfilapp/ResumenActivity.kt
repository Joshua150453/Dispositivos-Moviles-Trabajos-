/**
 * ResumenActivity
 * Muestra los datos enviados desde FormularioActivity y permite:
 *  - Confirmar (devuelve RESULT_OK)
 *  - Volver a editar (cierra sin confirmar)
 *
 * Autor: Joshua David Ortiz Rosas
 * Fecha creación: 20/09/2025
 * Última modificación: 23/09/2025
 */
package com.example.perfilapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    // Vistas del layout
    private lateinit var tvResumen: TextView
    private lateinit var btnConfirmar: Button
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        // Enlazar vistas con el layout
        tvResumen = findViewById(R.id.tvResumen)
        btnConfirmar = findViewById(R.id.btnConfirmar)
        btnVolver = findViewById(R.id.btnVolver)

        // Intent: intentar recuperar el objeto Usuario (Serializable) enviado desde FormularioActivity
        // Usamos "as? Usuario" para evitar ClassCastException si algo vino mal.
        val usuario = intent.getSerializableExtra("usuario") as? Usuario

        if (usuario != null) {
            // Mostrar los datos correctamente
            tvResumen.text = """
                Nombre: ${usuario.nombre}
                Edad: ${usuario.edad}
                Ciudad: ${usuario.ciudad}
                Correo: ${usuario.correo}
            """.trimIndent()
        } else {
            // Si no llego el objeto, intentamos leer valores por separado como fallback (opcional)
            val nombreFallback = intent.getStringExtra("usuario_nombre")
            val edadFallback = intent.getIntExtra("usuario_edad", 0)
            val ciudadFallback = intent.getStringExtra("usuario_ciudad")
            val correoFallback = intent.getStringExtra("usuario_correo")

            if (nombreFallback != null || ciudadFallback != null || correoFallback != null || edadFallback != 0) {
                tvResumen.text = """
                    Nombre: ${nombreFallback ?: "—"}
                    Edad: $edadFallback
                    Ciudad: ${ciudadFallback ?: "—"}
                    Correo: ${correoFallback ?: "—"}
                """.trimIndent()
            } else {
                // Mensaje claro para debug/usuario
                tvResumen.text = "No se recibieron datos del formulario."
            }
        }

        // Botón Confirmar: devuelve RESULT_OK a FormularioActivity
        btnConfirmar.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }

        // Botón Volver a editar: cierra la actividad (RESULT_CANCELED)
        btnVolver.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }
    }
}
