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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo Práctica 6</td></tr>
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
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Clase_RecyclerView</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>06 - Práctica Clase</td>
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

# Práctica Guiada: RecyclerView con Edición y Long Click

## Introducción teórica
El **RecyclerView** es un componente avanzado que permite mostrar listas de datos de manera eficiente.  
Cada elemento se representa mediante un **ViewHolder**, y el **Adapter** se encarga de enlazar los datos con las vistas.

---

## Introducción a los diálogos en Android
En Android, un **diálogo** es una ventana emergente que aparece sobre la pantalla actual.  
Se usa para mostrar mensajes importantes o pedir información sin cambiar de actividad.

El más común es el **AlertDialog**, que puede mostrar:
- Un título  
- Un mensaje o layout personalizado  
- Botones como *Aceptar* y *Cancelar*

## 🔗 Relación con RecyclerView

Al hacer long click en un elemento, se puede mostrar un menú de acciones (Editar o Eliminar).

Para editar un usuario, usamos un AlertDialog con layout personalizado que contiene los campos Nombre, Edad y Correo.

## 📝 Paso 1: Ver videos de referencia

  - RecyclerView básico
  
  - Long click en RecyclerView
  
  - AlertDialog en Android

## 📝 Paso 2: Código base del proyecto

  - El profesor entregará un proyecto con:
  
  - Una lista de usuarios mostrada en un RecyclerView.
  
  - Funcionalidad de agregar y eliminar usuarios ya implementada.
  
  - Un UsuarioAdapter y un UsuarioViewHolder básicos.

## 📝 Paso 3: Implementar long click

Agrega un setOnLongClickListener al UsuarioViewHolder para abrir un menú con opciones:


## 📝 Paso 4: Editar un usuario
  - 📌 Layout personalizado dialog_edit_usuario.xml
  
  - 📌 Inflar y mostrar el diálogo en el ViewHolder
  
## 🛠️ Paso 5: Probar la app

✔️ Haz un long click en un usuario.
✔️ Selecciona Editar, cambia los valores y guarda.
✔️ Verifica que el RecyclerView muestre los cambios.
✔️ Haz un long click y selecciona Eliminar para borrarlo.

🤔 Preguntas de reflexión

### ¿Qué diferencia hay entre notifyItemRemoved(), notifyItemInserted() y notifyItemChanged()?

- notifyItemRemoved() → Notifica que se eliminó un ítem en la lista.

- notifyItemInserted() → Notifica que se insertó un nuevo ítem.

- notifyItemChanged() → Notifica que un ítem existente cambió y debe actualizarse.

### ¿Por qué es necesario validar bindingAdapterPosition != RecyclerView.NO_POSITION?

Porque si el ViewHolder ya no está en una posición válida, intentar modificarlo podría causar errores o inconsistencias.

### ¿Qué ventajas tiene usar un diálogo frente a abrir una nueva pantalla para editar?

Es más rápido, mantiene al usuario en el mismo contexto y evita navegar entre pantallas innecesariamente.

🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Actividad%20en%20Clase_RecyclerView_Edicion_LongClick_ConDialogo/recyclerviewapp2)
