package com.example.ciclodevidaapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var contador = 0
    private lateinit var textViewContador: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewContador = findViewById(R.id.textViewContador)
        val btnAumentar = findViewById<Button>(R.id.btnAumentar)

        // Restauración alternativa: también podrías restaurar aquí:
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt("CONTADOR", 0)
            textViewContador.text = "Contador: $contador"
            Log.d("CICLO", "onCreate: restaurado contador = $contador (desde savedInstanceState)")
        }

        btnAumentar.setOnClickListener {
            contador++
            textViewContador.text = "Contador: $contador"
        }

        Log.d("CICLO", "onCreate llamado")
        Toast.makeText(this, "onCreate()", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("CICLO", "onStart llamado")
        Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("CICLO", "onResume llamado")
        Toast.makeText(this, "onResume()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("CICLO", "onPause llamado")
        Toast.makeText(this, "onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("CICLO", "onStop llamado")
        Toast.makeText(this, "onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CICLO", "onDestroy llamado")
        Toast.makeText(this, "onDestroy()", Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("CONTADOR", contador)
        Log.d("CICLO", "onSaveInstanceState: guardando contador = $contador")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contador = savedInstanceState.getInt("CONTADOR", 0)
        textViewContador.text = "Contador: $contador"
        Log.d("CICLO", "onRestoreInstanceState: contador restaurado = $contador")
    }
}