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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo Práctica 5</td></tr>
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
                        <tr><td>TÍTULO DEL TRABAJO:</td><td> Fragments y Navegación</td></tr>
                        <tr>
                            <td>NÚMERO DEL TRABAJO:</td><td>05 - Práctica</td>
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

## Ejercicios  

### 1️⃣ Configurador de pedidos de comida

📌 **Instrucciones:**

Permitir al usuario armar un pedido paso a paso y visualizarlo al final.


La aplicación debe tener:


🧩 Fragmento 1 – InicioFragment
- Botón: "Nuevo pedido" en la cual va a navegar hacia SeleccionComidaFragment.

🧩 Fragmento 2 – SeleccionComidaFragment
- Selección de extras (bebida, papas, postre).
- Al hacer clic en “Siguiente”: Se crea un Bundle con el tipo de comida seleccionado y se navega a SeleccionExtrasFragment.

🧩 Fragmento 3 – SeleccionExtrasFragment
- Selección de extras (bebida, papas, postre).
- Al hacer click en "Siguiente": Se agrega la info de los extras al mismo Bundle o se crea uno nuevo con todo y se navega a ResumenPedidoFragment.

🧩 Fragmento 4 – ResumenPedidoFragment
- Usa arguments?.getString(...), etc. para mostrar la comida y extras.
- Tiene dos botones: “Confirmar pedido” en la cual muestra un Toast y vuelve al inicio (navigate()) y "Editar pedido” que usa setFragmentResult() con los datos actuales del pedido. Este llama a popBackStack() para regresar a SeleccionComidaFragment, que los puede recuperar con setFragmentResultListener(...).

📍 **Se debe usar:**
- Paso de datos hacia adelante con navigate().
- Uso de objeto Bundle para paso de datos.
- Comunicación de regreso con setFragmentResult() + setFragmentResultListener().
- Uso de popBackStack() para volver a otro fragmento.
- Uso de Safe Args de manera opcional.

🔗 [Ejercicio desarrollado](https://github.com/Joshua150453/Dispositivos-Moviles-Trabajos-/tree/main/Quinto%20Entregable/FragmentsyNavegacin)
