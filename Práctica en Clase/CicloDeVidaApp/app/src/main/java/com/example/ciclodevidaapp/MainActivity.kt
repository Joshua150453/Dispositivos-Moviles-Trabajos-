package com.example.ciclodevidaapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// Clase principal que extiende AppCompatActivity
class MainActivity : AppCompatActivity() {

    // Variable para contar las veces que se presiona el botón
    private var contador = 0

    // Referencia al TextView que muestra el contador
    private lateinit var textViewContador: TextView

    // Método llamado al crear la actividad (primera vez o tras rotación)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Asocia el XML a la actividad

        // Inicializamos los componentes visuales
        textViewContador = findViewById(R.id.textViewContador)
        val btnAumentar = findViewById<Button>(R.id.btnAumentar)

        // Si existe un estado guardado, restauramos el contador
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt("CONTADOR", 0)
            textViewContador.text = "Contador: $contador"
            Log.d("CICLO", "onCreate: restaurado contador = $contador (desde savedInstanceState)")
        }

        // Acción del botón → aumenta el contador en 1
        btnAumentar.setOnClickListener {
            contador++
            textViewContador.text = "Contador: $contador"
        }

        // Logs y Toast para verificar el ciclo de vida
        Log.d("CICLO", "onCreate llamado")
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show()
    }

    // Método llamado cuando la actividad se vuelve visible
    override fun onStart() {
        super.onStart()
        Log.d("CICLO", "onStart llamado")
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show()
    }

    // Método llamado cuando la actividad ya está lista para interactuar
    override fun onResume() {
        super.onResume()
        Log.d("CICLO", "onResume llamado")
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show()
    }

    // Método llamado cuando la actividad está parcialmente oculta (otra ventana encima)
    override fun onPause() {
        super.onPause()
        Log.d("CICLO", "onPause llamado")
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
    }

    // Método llamado cuando la actividad ya no es visible
    override fun onStop() {
        super.onStop()
        Log.d("CICLO", "onStop llamado")
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
    }

    // Método llamado justo antes de que la actividad sea destruida
    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO", "onDestroy llamado")
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
    }

    // Guarda el estado de la actividad (por ejemplo, al rotar la pantalla)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("CONTADOR", contador) // Guardamos el contador
        Log.d("CICLO", "onSaveInstanceState: guardando contador = $contador")
    }

    // Restaura el estado guardado (se ejecuta después de onStart)
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contador = savedInstanceState.getInt("CONTADOR", 0)
        textViewContador.text = "Contador: $contador"
        Log.d("CICLO", "onRestoreInstanceState: contador restaurado = $contador")
    }
}
