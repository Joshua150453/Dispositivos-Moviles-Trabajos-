/**
 * Actividad principal (Formulario)
 * Permite ingresar datos de usuario: nombre, edad, ciudad, correo.
 * Autor: Joshua David Ortiz Rosas
 * Fecha creación: 20/09/2025
 * Última modificación: 23/09/2025
 */
package com.example.perfilapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    // Declaración de vistas
    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText
    private lateinit var btnContinuar: Button

    // Callback para recibir resultado desde ResumenActivity
    // Si el resultado es OK, muestra un Toast indicando que el perfil fue guardado
    private val resumenLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val mensaje = getString(R.string.perfil_guardado)
            Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        // Inicializamos las vistas
        inicializarVistas()

        // Si la actividad se recrea (ej. rotación de pantalla), restaurar valores guardados
        if (savedInstanceState != null) {
            restaurarEstado(savedInstanceState)
        }

        // Listener para el botón "Continuar"
        btnContinuar.setOnClickListener {
            enviarDatos()
        }
    }

    /**
     * Método para enlazar las vistas con sus IDs del layout
     */
    private fun inicializarVistas() {
        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etCiudad = findViewById(R.id.etCiudad)
        etCorreo = findViewById(R.id.etCorreo)
        btnContinuar = findViewById(R.id.btnContinuar)
    }

    /**
     * Envía los datos ingresados a la ResumenActivity usando un Intent
     */
    private fun enviarDatos() {
        // Obtenemos valores del formulario
        val nombre = etNombre.text.toString()
        val edad = etEdad.text.toString().toIntOrNull() ?: 0
        val ciudad = etCiudad.text.toString()
        val correo = etCorreo.text.toString()

        // Validaciones simples
        require(nombre.isNotBlank()) { "El nombre no puede estar vacío" }
        require(edad > 0) { "La edad debe ser mayor a 0" }

        // Creamos objeto Usuario (Serializable)
        val usuario = Usuario(nombre, edad, ciudad, correo)

        // Enviamos el objeto a la ResumenActivity
        val intent = Intent(this, ResumenActivity::class.java)
        intent.putExtra("usuario", usuario)

        // Lanzamos la actividad y esperamos un resultado
        resumenLauncher.launch(intent)
    }

    /**
     * Guarda el estado de los campos del formulario cuando la pantalla rota
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombre", etNombre.text.toString())
        outState.putString("edad", etEdad.text.toString())
        outState.putString("ciudad", etCiudad.text.toString())
        outState.putString("correo", etCorreo.text.toString())
    }

    /**
     * Restaura el estado de los campos al recrear la actividad
     */
    private fun restaurarEstado(savedInstanceState: Bundle) {
        etNombre.setText(savedInstanceState.getString("nombre", ""))
        etEdad.setText(savedInstanceState.getString("edad", ""))
        etCiudad.setText(savedInstanceState.getString("ciudad", ""))
        etCorreo.setText(savedInstanceState.getString("correo", ""))
    }
}
