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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo Examen Parcial</td></tr>
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
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Examen Parcial</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>07 - Práctica Parcial</td>
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

# Examen Parcial: Juego de Colores
Desarrolla una aplicación usando Kotlin y Android Studio. El juego pondrá a prueba tu capacidad de crear una app interactiva con múltiples fragments, navegación, gestión de estados del ciclo de vida, la interacción avanzada con RecyclerView, manejo de ventanas de diálogo, lógica condicional y elementos visuales.

🔗 [Trabajo Examen Parcial](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Trabajo%20Examen%20Parcial)

## 🎯 Objetivo:
Crear un juego donde el usuario debe presionar el botón que coincida con el color que aparece en pantalla. El objetivo es obtener la mayor cantidad de aciertos en 30 segundos, mostrar el historial de puntajes en la sesión (sin usar Room/BD).

## 🧩 ¿Qué debe tener la aplicación?
### 1. Fragmento de bienvenida (WelcomeFragment):
  - Título del juego.
  - Mensaje de bienvenida y reglas del juego (Mostrar en un AlertDialog)
  - Botón “Iniciar juego” para comenzar.
  - Interfaz libre pueden incluir imágenes.
#### 🧠 Explicación:
    - Muestra un AlertDialog con las reglas del juego → cumple el requisito "Mensaje de bienvenida y reglas del juego".
    - Tiene un botón “Iniciar juego” que navega hacia el GameFragment → cumple "Botón para comenzar el juego".
    - Usa ConstraintLayout con texto y posible imagen decorativa → cumple "Interfaz libre con imágenes".
    
### 2. Fragmento del juego (GameFragment):
#### 🧠 Explicación:
  - Usa un CountDownTimer → controla los 30 segundos del juego.
  - Muestra el color actual y botones de respuesta → cumple los requisitos del cuadro y botones de colores.
  - Cada acierto aumenta el puntaje y cambia el color.
  - Cuando el tiempo termina, navega automáticamente al ResultFragment con el puntaje actual.
  - Se usa animación en los botones y colores, por ejemplo:
```Kotlin
private fun animateSuccess() {
        val anim = ObjectAnimator.ofFloat(binding.viewColorBox, "scaleX", 1f, 1.08f, 1f)
        anim.duration = 200
        anim.interpolator = DecelerateInterpolator()
        anim.start()
    }
```
### 3. Fragmento de resultados (ResultFragment):
  - Muestra el puntaje final de la partida actual.
  - Muestra el puntaje más alto histórico (Usar SharedPreferences).
  - Contiene un RecyclerView para mostrar el Historial de Puntajes sin persintencia. Puede solo visualizar el historial de las partidas de la sesión.
  - Botón para volver a jugar.
#### 🧠 Explicación:
    - Obtiene el puntaje actual mediante argumentos del GameFragment.
    - Usa PrefsHelper (basado en SharedPreferences) para guardar el puntaje más alto histórico.
    - Muestra un RecyclerView con los puntajes de la sesión actual (sin base de datos).
    - Botón “Volver a jugar” → reinicia el flujo del juego.

### 4. PrefsHelper:
  - Manejar el almacenamiento básico del puntaje más alto con SharedPreferences.

### 5. ScoreAdapter:
  - Mostrar la lista de puntajes jugados durante la sesión en el RecyclerView del ResultFragment.
  - Implementa RecyclerView funcional para el historial de puntajes.

### 6. Navigation:
  - Define el gráfico de navegación (nav_graph.xml), que indica cómo se mueven los fragments (Welcome → Game → Result).

### 7. build.gradle.kts (Project: Juego_de_Colores)
  - Configura versiones globales de dependencias y plugins (por ejemplo Kotlin, Navigation, Compose).

### 8. build.gradle.kts (Module: app)
Contiene las dependencias específicas del módulo:
- AndroidX, Navigation, ViewModel, Animaciones, etc.
- También configura el SDK y los plugins usados.
- Se requiere hacer (Sync Proyect with Gradle Files) para verificar que todas la dependencias se carguen y luego se carga el juego

### 9. settings.gradle.kts
- Indica qué módulos pertenecen al proyecto (en este caso solo :app) y de dónde se obtienen las dependencias (repositorios como MavenCentral o Google).
- Se requiere hacer (Sync Proyect with Gradle Files) para verificar que todas la dependencias se carguen, y luego se carga el juego

## 🧩 Funcionalidades Adicionales (elige al menos una, es obligatoria):
    - 🎨 Aplica animaciones a los botones o colores que aparecen: Esta funcionalidad está implementada dentro de tu archivo GameFragment.kt, específicamente en las funciones:
```Kotlin
  private fun animateSuccess() {
        val anim = ObjectAnimator.ofFloat(binding.viewColorBox, "scaleX", 1f, 1.08f, 1f)
        anim.duration = 200
        anim.interpolator = DecelerateInterpolator()
        anim.start()
    }

    // Animación al fallar (vibración lateral)
    private fun animateFailure() {
        lifecycleScope.launch {
            val anim = ObjectAnimator.ofFloat(binding.viewColorBox, "translationX", 0f, 20f, -20f, 0f)
            anim.duration = 300
            anim.start()
            delay(300)
        }
    }
```
   - Y se activan en los siguientes momentos dentro del método onColorPressed():
```Kotlin
  private fun onColorPressed(selectedName: String) {
        val hit = selectedName == currentTarget.name
        if (hit) {
            viewModel.incrementScore() // Suma puntaje
            animateSuccess() // Efecto visual
            pickNewTarget()  // Cambia a otro color
        } else {
            animateFailure() // Animación de vibración
        }
    }
```
     - Cuando el jugador acierta, el cuadro del color (viewColorBox) aumenta ligeramente su tamaño horizontalmente y luego vuelve a su tamaño original.
       Esto da un efecto visual de “rebote” o “éxito visual”.
     - Si el usuario elige un color incorrecto, el cuadro de color “tiembla” de lado a lado, simulando una vibración de error.
     
## 🧪 ¿Qué se debe practicar?
  - Navegación entre Fragments y paso de datos.
  - Uso de temporizador (CountDownTimer).
  - Interacción con el usuario a través de botones y feedback.
  - Manejo de estados y lógica condicional básica.
  - Diseño de UI con ConstraintLayout.
  - Control de errores y validación del input del usuario.
  - Organización del código y buenas prácticas de programación en Kotlin.
  - Uso adecuado de recursos visuales (colores, imágenes, etc).
  - Almacenamiento básico de datos usando SharedPreferences 
  - Uso de AlertDialog.
  - Almacenamiento de datos usando Room (si eliges esa funcionalidad adicional).
  - Incorporación de medios como sonidos o animaciones opcionales (si eliges esa funcionalidad adicional).

## 🧠 Tips útiles:
  - Usa recursos de cadenas en strings.xml.
  - Usa recursos de colores en colors.xml.
  - Usa una función para generar el color aleatorio.
  - Para el temporizador, revisa la clase CountDownTimer.
  - Para el puntaje más alto histórico, revisa SharedPreferences.
  - Codigos como GameFragment, WelcomeFragment, etc. Y otras Similares se ubican en diferentes Carpetas para que el proyecto este organizado por capa:
    ### 🧠 model/
    Contiene las clases de datos (como Score), que representan la información del juego.
    👉 Motivo: separar la lógica de los datos del resto de la app.
    
    ### 🎮 viewmodel/    
    Guarda la lógica principal (GameViewModel), que controla el estado del juego.
    👉 Motivo: sigue el patrón MVVM (Model–View–ViewModel), donde el ViewModel actúa como puente entre los datos (model) y la interfaz (ui).
    
    ### 🎨 ui/  
    Contiene todo lo relacionado con la interfaz gráfica del usuario. 
      - fragments/: pantallas o vistas del juego.   
      - adapters/: adaptadores que conectan datos con vistas (por ejemplo, listas).
    👉 Motivo: separar la presentación del comportamiento lógico.
    
    ### ⚙️ util/
    Funciones o clases reutilizables en toda la app (por ejemplo, manejo de colores o preferencias).
    👉 Motivo: evitar repetir código y centralizar funciones comunes.
