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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo Práctica 4</td></tr>
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
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Comunicación entre Actividades</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>04 - De tareas dejadas</td>
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

# Informe de la Práctica: Comunicación entre Actividades
## Ejercicio 1. Editor de Perfil con Confirmación
### 🎯 Problema a Resolver
Crear una app que permita llenar un perfil de usuario, mostrar los datos en otra pantalla y confirmar si está correcto.

### ¿Qué debe tener la aplicación?
### Actividad 1 – FormularioActivity
  - Cuatro campos para: Nombre, Edad, Ciudad, y Correo electrónico.
  - Un botón que diga “Continuar”.
  - Al presionarlo, se envían los datos a la segunda actividad.

### Actividad 2 – ResumenActivity
Muestra un resumen de los datos escritos.
#### Tiene dos botones:
    - “Confirmar” (vuelve a la primera pantalla y aparece un Toast que diga “Perfil guardado correctamente”).
    - “Volver a editar” (vuelve a la pantalla anterior para seguir editando información).
    
### ¿Qué se debe practicar?
    - Envío de datos con Intent (usando una clase Usuario y Serializable).
    - Envío de resultados de vuelta con registerForActivityResult, setResult.
    - Guardar los textos escritos si se gira la pantalla usando onSaveInstanceState().

### 💡 Resumen de la Solución
El proyecto resuelve el problema utilizando dos Activities de Android, sin necesidad de usar fragments. La solución implementa un flujo de usuario simple y claro: la primera Activity recopila la información del perfil y la segunda la muestra para su confirmación. El proyecto utiliza conceptos fundamentales de Android como el paso de datos entre pantallas, la gestión del ciclo de vida y la persistencia del estado en caso de cambios en la configuración.

Link 🔗 [Editor de Perfil con Confirmación - Ejercico 1](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Cuarto%20Entregable/Editordeperfil)

### 💻 Archivos del Proyecto
#### FormularioActivity.kt
Este archivo contiene la lógica de la primera pantalla de la aplicación. Se encarga de capturar la entrada del usuario, validar los datos básicos, empaquetarlos en un objeto Usuario y enviarlos a la siguiente actividad. También implementa onSaveInstanceState para asegurar que el estado de los campos se conserve si la pantalla rota.

Link 🔗 [FormularioActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/java/com/example/perfilapp/FormularioActivity.kt)

#### ResumenActivity.kt
Este archivo maneja la lógica de la segunda pantalla. Recibe el objeto Usuario a través del Intent, lo muestra en pantalla y gestiona las acciones de los botones "Confirmar" y "Volver a editar" enviando un resultado de vuelta a la FormularioActivity.

Link 🔗 [ResumenActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/java/com/example/perfilapp/ResumenActivity.kt)

#### Usuario.kt
Una clase de datos (data class) simple y concisa que modela la información de un perfil de usuario. Implementa la interfaz Serializable para que los objetos de esta clase puedan ser pasados entre Activities usando un Intent.

Link 🔗 [Usuario.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/java/com/example/perfilapp/Usuario.kt)

#### AndroidManifest.xml
Este es el archivo de configuración del proyecto. Declara las dos Activities (FormularioActivity y ResumenActivity) y establece cuál de ellas es la actividad de inicio de la aplicación.

Link 🔗 [AndroidManifest.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/AndroidManifest.xml)

#### activity_formulario.xml
El archivo de diseño (layout) de la primera pantalla. Utiliza un LinearLayout para organizar los campos de entrada y un botón de manera vertical.

Link 🔗 [activity_formulario.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/res/layout/activity_formulario.xml)

#### activity_resumen.xml
El archivo de diseño de la segunda pantalla. Muestra un TextView para el resumen y dos botones para las acciones de "Confirmar" y "Volver a editar", también usando un LinearLayout.

Link 🔗 [activity_resumen.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/res/layout/activity_resumen.xml)

#### colors.xml
Este archivo centraliza la definición de los colores utilizados en la aplicación, lo que facilita el mantenimiento y la consistencia visual.

Link 🔗 [colors.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/res/values/colors.xml)

#### strings.xml
Contiene todas las cadenas de texto utilizadas en la interfaz de usuario. Centralizar los textos es una buena práctica que simplifica la traducción y la gestión del contenido.

Link 🔗 [Estrings.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/res/values/strings.xml)

#### themes.xml
Define el estilo visual de la aplicación. En este caso, hereda del tema de Material 3 y define los colores principales y la barra de acción.

Link 🔗 [themes.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordeperfil/app/src/main/res/values/themes.xml)


# 📝 Ejercicio 2. Editor de Nota Rápida

## 🎯 Objetivo
Permitir al usuario escribir una nota, enviarla a otra actividad para elegir **compartirla** o **volver a editar**.

---

## 🧩 Requisitos de la aplicación

### 1. Actividad 1 – `EditorActivity`
- Un campo de texto (`EditText`) para escribir una nota.  
- Un botón que diga **“Compartir”**.  
- Al presionar, la nota se manda a otra pantalla.  

### 2. Actividad 2 – `OpcionesActivity`
- Muestra la nota recibida.  
- Tiene dos botones:  
  - **“Compartir por correo”** → muestra un `Toast` que diga `"Compartido por correo"`.  
  - **“Editar de nuevo”** → vuelve a la pantalla anterior con el texto para seguir escribiendo.  

---

## 🧪 Conceptos a practicar
- **Comunicación de datos entre actividades.**  
- **Envío de información de regreso** usando `registerForActivityResult` y `setResult`.  
- **Guardar el contenido de la nota al rotar la pantalla** con `onSaveInstanceState()`.  

---

## 🧠 Tips útiles
- Usa `Intent.putExtra("nota", texto)` para enviar datos entre actividades.  
- Usa `setResult` para devolver información a la actividad anterior.  
- Implementa `onSaveInstanceState()` para que el texto no se pierda si el dispositivo rota.  

Link 🔗 [Editor de Nota Rapida - Ejercico 2](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Cuarto%20Entregable/Editordenotarpida)

---

### 📂 Estructura del proyecto

#### EditorActivity
##### Qué hace:
   - Muestra un campo de texto y un botón.
   - Envía la nota a otra actividad.
   - Recupera la nota editada de regreso.
   - Conserva el texto al rotar la pantalla.

Link 🔗 [EditorActivity](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordenotarpida/app/src/main/java/com/example/editorapp/EditorActivity.kt)

#### OpcionesActivity.kt
##### Qué hace:
Muestra la nota recibida.
   - Opción 1: muestra un Toast simulando compartir por correo.
   - Opción 2: devuelve la nota a EditorActivity para seguir editando.

Link 🔗 [OpcionesActivity.kt](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordenotarpida/app/src/main/java/com/example/editorapp/OpcionesActivity.kt)

#### activity_editor.xml
##### Qué hace: 
Interfaz sencilla para escribir una nota y enviarla.

Link 🔗 [activity_editor.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordenotarpida/app/src/main/res/layout/activity_editor.xml)

#### activity_opciones.xml
##### Qué hace: 
Interfaz con la nota recibida y dos botones de acción.

Link 🔗 [activity_opciones.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordenotarpida/app/src/main/res/layout/activity_opciones.xml)

#### AndroidManifest.xml
##### Qué hace:
   - Declara ambas actividades.
   - EditorActivity es la actividad principal (exported="true" obligatorio en Android 12+).
   - OpcionesActivity no es pública (exported="false").

Link 🔗 [AndroidManifest.xml](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/blob/main/Cuarto%20Entregable/Editordenotarpida/app/src/main/AndroidManifest.xml)

### 🧪 Funcionamiento final
1. Usuario escribe una nota en EditorActivity.

2. Pulsa Compartir → abre OpcionesActivity.

3. Allí puede elegir:
    - Compartir por correo → muestra Toast.
    - Editar de nuevo → regresa a EditorActivity con la nota intacta.

4. Al rotar la pantalla, el texto no se pierde.

### ✅ Conclusión
La práctica se resuelve completamente:
   -Comunicación entre actividades sin fragments.
   -Uso de Intent, setResult, registerForActivityResult.
   -Manejo de estado con onSaveInstanceState.
   -Cumple con los requisitos de Android 12+ (android:exported).
