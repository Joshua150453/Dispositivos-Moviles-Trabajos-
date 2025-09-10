<table align="center">
    <thead>
        <tr>
            <td><img src="https://1.bp.blogspot.com/-3wALNMake70/XK-07VtIngI/AAAAAAABOrY/n3X_ZJV5fGEpTs8ppMQvKk_yic7BfyBYQCLcBGAs/s1600/universidad-la-salle-logo.jpg?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD LA SALLE</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE SOFTWARE</span><br />
            </th>
        </tr>
    </thead>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo en Clase</td></tr>
    </tbody>
</table>

<div align="center">
    <span style="font-weight:bold;">GUÍA DEL AVANCE</span><br />
</div>

<div>
    <table border="1" align="center">
        <thead>
            <tr><th colspan="3">INFORMACIÓN BÁSICA</th></tr>
        </thead>
        <tbody>
            <tr>
                <td colspan="2">
                    <table>
                        <tr><td>ASIGNATURA:</td><td>Programción para Dispositivos Moviles</td></tr>
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Ciclo de Vida App</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>04</td>
                            <td>AÑO:</td><td>2025</td>
                            <td>NRO. SEMESTRE:</td><td>VI</td>
                        </tr>
                        <tr>
                            <td colspan="6">DOCENTE:
                                <ul>
                                    <li>Josue Miguel Flores Parra - jfloresp@ulasalle.edu.pe</li>
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td colspan="6">INTEGRANTE:
                                <ul>
                                    <li>Ortiz Rosas Joshua David</li>
                                </ul>
                            </td>
                        </tr>
                    </table>
                </td>
                <td>
                    </table>
                    <table>
                </td>
            </tr>
        </tbody>
    </table>
</div>

# Informe de la Práctica: Ciclo de Vida en Android

## 📌 Descripción de la Tarea

El objetivo de esta práctica fue **comprender y evidenciar el ciclo de vida de una Activity en Android**, utilizando métodos como `onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy` y `onSaveInstanceState`.\ 
Además, se implementó un **contador que persiste su valor al rotar la pantalla** gracias al uso de `onSaveInstanceState`.

Link 🔗 [Práctica en Clase](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Pr%C3%A1ctica%20en%20Clase)

------------------------------------------------------------------------

## 🛠️ Resolución y Código Implementado

### 1. Layout (`activity_main.xml`)

Se creó un layout con un `TextView` para mostrar el contador y un
`Button` para aumentarlo.

``` xml
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:background="#FAF0FF">

    <TextView
        android:id="@+id/tvContador"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Contador: 0"
        android:textSize="20sp"
        android:layout_marginBottom="20dp"/>

    <Button
        android:id="@+id/btnContador"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Aumentar contador"
        android:backgroundTint="@color/purple_500"
        android:textColor="@android:color/white"/>
</LinearLayout>
```

Link 🔗 [activity_main.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Pr%C3%A1ctica%20en%20Clase/CicloDeVidaApp/app/src/main/res/layout/activity_main.xml)

------------------------------------------------------------------------

### 2. Lógica en `MainActivity.kt`

Se implementaron los métodos del ciclo de vida y la lógica del contador
con persistencia.

``` kotlin
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
```

Link 🔗 [MainActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Pr%C3%A1ctica%20en%20Clase/CicloDeVidaApp/app/src/main/java/com/example/ciclodevidaapp/MainActivity.kt)

------------------------------------------------------------------------

## 📊 Resultados

### 1. Aplicación en ejecución

-   La aplicación inicia con un contador en **0**.\
-   Al presionar el botón, el contador aumenta.\
-   Al rotar la pantalla, el contador mantiene su valor gracias a `onSaveInstanceState`.

### 2. Logcat (`CICLO`)

En el **Logcat** se muestran los métodos del ciclo de vida llamados en cada acción.\
Ejemplo de salida:

    D/CICLO: onCreate llamado
    D/CICLO: onStart llamado
    D/CICLO: onResume llamado
    D/CICLO: onSaveInstanceState: guardando contador = 13
    D/CICLO: onStop llamado
    D/CICLO: onDestroy llamado
    D/CICLO: onCreate llamado
    D/CICLO: onStart llamado
    D/CICLO: onResume llamado

------------------------------------------------------------------------

## ❓ Preguntas y Respuestas

### 🔹 ¿Qué sucede si no usamos `onSaveInstanceState`?

El **contador se pierde al rotar la pantalla**, porque Android destruye la `Activity` y crea una nueva, sin recordar el valor de las variables.

### 🔹 ¿Por qué Android destruye y vuelve a crear la `Activity` al rotar la pantalla?

Porque un **cambio de orientación implica una reconfiguración completa de la interfaz**. Android destruye la `Activity` actual y la vuelve a crear para aplicar los nuevos recursos (`layout-land`, dimensiones, etc.).

### 🔹 ¿En qué casos prácticos usaría `onPause` y `onStop` en una aplicación real?

-   **onPause:** Guardar datos temporales o pausar animaciones/música cuando la app pasa a segundo plano.\
-   **onStop:** Liberar recursos pesados (GPS, cámara, sensores) cuando la app ya no es visible para el usuario.

------------------------------------------------------------------------

## ✅ Conclusión

Esta práctica permitió comprender cómo Android maneja el **ciclo de vida de las Activities** y la importancia de **guardar estados temporales** con `onSaveInstanceState`.\ Además, se evidenció en Logcat cómo se ejecutan los métodos en cada evento, y se aprendió a diferenciar el uso práctico de `onPause` y `onStop`.
