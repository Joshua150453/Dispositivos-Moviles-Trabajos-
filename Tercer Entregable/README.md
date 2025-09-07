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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo 2</td></tr>
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
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Introducción a Kotlin</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>02</td>
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

## Codigos:
### 1. Interacción con Imágenes:
Instrucciones:
  - Agregar una imagen a tu actividad.
  - Programar la funcionalidad para que al hacer clic en la imagen, se muestre un Toast con un mensaje personalizado.

### Resumen de la implementación
- Se agregó un `ImageView` en el layout principal (`activity_main.xml`) para mostrar la imagen ubicada en la carpeta `res/drawable`.
- En `MainActivity.kt` se utilizó `findViewById` para enlazar el `ImageView` y se configuró un `setOnClickListener` para detectar clics.
- Al hacer clic sobre la imagen, se muestra un **Toast** con un mensaje personalizado en pantalla **Has hecho click en la imagen**.
- En `AndroidManifest.xml` se definió `MainActivity` como la actividad principal para que la aplicación inicie con esta interfaz.

🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Tercer%20Entregable/Ejercicio_1)

**Links de los archivos principales del Ejercicio Desarrollado**
🔗 [AndroidManifest.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejercicio_1/app/src/main/AndroidManifest.xml)
🔗 [MainActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejercicio_1/app/src/main/java/com/example/imageninteraccion/MainActivity.kt)
🔗 [activity_main.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejercicio_1/app/src/main/res/layout/activity_main.xml)
🔗 [mi_imagen.png](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejercicio_1/app/src/main/res/drawable/mi_imagen.png)

### 2. Reproductor de Música Básico:
Instrucciones:
  -Crea una interfaz de usuario con botones para reproducir, pausar y detener la reproducción de música.
  -Implementa la lógica para reproducir un archivo de audio almacenado localmente en el dispositivo al presionar el botón de reproducción.
  -Nota: Investigar cómo usar la carpeta res/raw y el objeto MediaPlayer (Android/Kotlin)

#### Resumen del Reproductor de Música Básico 🎵

Este proyecto implementa un reproductor de música sencillo en Android utilizando **Kotlin** y el objeto `MediaPlayer`.  
La aplicación permite reproducir un archivo de audio local almacenado en la carpeta `res/raw` mediante una interfaz gráfica con botones de **Reproducir**, **Pausar** y **Detener**.

##### Características principales:
- Reproduce un archivo MP3 incluido en `res/raw`.
- Control de reproducción:
  - ▶ Reproducir: inicia la pista.
  - ⏸ Pausar: detiene la reproducción temporalmente.
  - ⏹ Detener: libera los recursos y reinicia la pista.
- Compatible con Android 12+ (`android:exported` en el Manifest).
- Uso de `MediaPlayer` para manejar el audio.

##### Requisitos:
- Archivo de audio en formato `.mp3` dentro de `app/src/main/res/raw/`.
- Tema configurado en el `AndroidManifest.xml` (`Material3` recomendado).
- Android Studio y un dispositivo/emulador para pruebas.

🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Tercer%20Entregable/Ejecicio_2)

**Links de los archivos principales del Ejercicio Desarrollado**
🔗 [AndroidManifest.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejecicio_2/app/src/main/AndroidManifest.xml)
🔗 [MainActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejecicio_2/app/src/main/java/com/example/musicplayer/MainActivity.kt)
🔗 [activity_main.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejecicio_2/app/src/main/res/layout/activity_main.xml)
🔗 [mimusica.mp3](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Tercer%20Entregable/Ejecicio_2/app/src/main/res/raw/mimusica.mp3)


