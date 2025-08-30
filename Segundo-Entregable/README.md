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
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Trabajo 1</td></tr>
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
                            <td>NÚMERO DEL TRABAJO:</td><td>01</td>
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
### Clase para Cuenta Bancaria:
Este código implementa una clase CuentaBancaria en Kotlin que modela una cuenta con saldo y límite de retiro.
  - Se valida que el saldo inicial no sea negativo y que el límite de retiro sea mayor que cero.
  - Tiene propiedades con getters y setters que permiten leer y modificar el saldo y el límite, validando siempre los datos.
  - El método retirar(monto) controla que el retiro no exceda el saldo disponible ni el límite permitido, y actualiza el saldo si la operación es válida.

En el main, el programa:
  -Solicita al usuario el saldo inicial y el límite de retiro.
  -Crea una cuenta con esos valores.
  -Pide dos montos a retirar y ejecuta la operación mostrando mensajes de éxito o error según las condiciones.

En resumen: es un pequeño sistema interactivo que permite crear una cuenta bancaria, validar sus datos y realizar retiros con restricciones.

**Ejemplo de uso:**  

```bash
Ingrese saldo inicial: 800
Ingrese límite de retiro: 300
Ingrese monto a retirar: 350
No puedes retirar más del límite permitido.

Ingrese monto a retirar: 150
Retiro exitoso. Saldo restante: 650.0
```

🔗 [Ejercicio desarrollado](Segundo-Entregable/Clase para Cuenta Bancaria.kt)
