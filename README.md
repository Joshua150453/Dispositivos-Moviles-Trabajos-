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

## **Tablero de Commits**

| Nro. |Código |Commits |
| ------------- | ------------- | ------------- |
| 1  | 6af23b0 | Creación de la primera carpeta de entregables |
| 2  | 8c61ca5 | Subiendo las carpetas completas |
| 3  | b8de9ba | Trabajos a entregar realizados en Kotlin | 
| 4  | d2aae9f | README del primer trabajo |

## Github
Los ejercicios se encuentran en la carpeta Primer-Entregable, cada uno ubicado en su respectiva carpeta ademas de externamente por si se desea verlos mas rapido, dentro de sus respectivas carpetas (Ejercicio #) en la carpeta src como se presento en clase se encuentra el codigo a compilar.

### Ejercico 1:
El programa pide al usuario su salario mensual y su puntuación de rendimiento (entre 0 y 10).
Con esos datos:
- Clasifica el nivel de rendimiento (Inaceptable, Aceptable o Meritorio).
- Calcula cuánto dinero recibe el empleado en base a su salario y la puntuación.
Finalmente, muestra en pantalla ambos resultados.
#### Proceso:
Se pide al usuario:
- Salario → Convertido a Double porque puede tener decimales.
- Puntuación → Convertido a Int porque es un número entero entre 0 y 10.

Se llaman dos funciones:
- obtenerNivel(puntuacion) → Devuelve un texto con el nivel de rendimiento.
- calcularDinero(salario, puntuacion) → Calcula la cantidad de dinero a recibir.

Muestra el nivel y el dinero en pantalla, con el dinero formateado a dos decimales.

Clasifica la puntuación:
- 0..3 → Inaceptable.
- 4..6 → Aceptable.
- 7..10 → Meritorio.
Cualquier otro valor → "Puntuación inválida".

Calcula el dinero recibido:
- Convierte la puntuación a un porcentaje sobre 10.
- Multiplica el salario por ese porcentaje.
- Si la puntuación no es válida, devuelve 0.0.

Este programa es una mini-calculadora de rendimiento que:
-- Lee el salario y la puntuación.
-- Clasifica al empleado según su nivel de rendimiento.
-- Calcula cuánto dinero recibe en función de su desempeño.

### Ejercicio 2:
Este programa implementa el clásico juego de Piedra, Papel o Tijera entre el usuario y la computadora.
La computadora selecciona una opción al azar, mientras que el usuario ingresa la suya desde el teclado.
Luego, el sistema compara ambas elecciones y determina el resultado: empate, victoria o derrota.
#### Proceso:
- Se importa Random para generar la elección de la computadora.
- En main el usuario y la computadora eligen, luego se muestra el resultado.
- eleccionComputadora() devuelve "Piedra", "Papel" o "Tijera" al azar.
- eleccionUsuario() pide la jugada, la normaliza y valida hasta que sea correcta.
- ganador() compara ambas elecciones y devuelve "Empate", "¡Ganaste!" o "Perdiste".

### Ejercicio 3:
Este programa es una calculadora básica en Kotlin que permite realizar operaciones matemáticas como suma, resta, multiplicación y división. Funciona mediante un menú interactivo que se repite hasta que el usuario decide salir.
#### Proceso:
- El programa muestra un menú con opciones del 1 al 5.
- Si el usuario elige una operación (1 a 4), se piden dos números para calcular.
- Dependiendo de la opción:
   - suma() → suma los dos números.
   - resta() → resta el segundo al primero.
   - multiplicacion() → multiplica ambos valores.
   - division() → divide, validando que el divisor no sea cero.
   - Si el usuario escribe un número distinto de 1–5, aparece un mensaje de error.
   - El menú se repite en un bucle do…while hasta que el usuario elige la opción 5 (Salir).
-Al final, se muestra el mensaje "Saliendo de la calculadora...".

### Ejercicio 4:
Este programa consiste en un juego simple donde el sistema genera un número aleatorio entre 1 y 30. El jugador tiene un máximo de 5 intentos para adivinar el número secreto. Después de cada intento, el programa da una pista indicando si el número ingresado es mayor o menor que el número secreto. Si el jugador acierta, gana inmediatamente; si no, al final se revela el número correcto.
#### Proceso:
- Importación: Se importa kotlin.random.Random para poder generar un número aleatorio.
- Número secreto: Se genera un número aleatorio entre 1 y 30 que el jugador debe adivinar.
- Intentos: Se le dan 5 oportunidades al jugador para adivinar el número.
- Entrada del usuario: Con readLine()!!.toInt() el programa lee lo que el usuario escribe y lo convierte en número entero.
   - Comparaciones:
     - Si el número ingresado es igual al secreto → gana y el programa termina.
     - Si es menor → el programa avisa que el secreto es mayor.
     - Si es mayor → el programa avisa que el secreto es menor.
- Final: Si no acierta en 5 intentos, el programa revela el número secreto.



