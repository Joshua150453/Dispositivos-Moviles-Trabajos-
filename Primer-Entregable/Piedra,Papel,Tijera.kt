/*
Descripción: Juego de Piedra, Papel o Tijera contra la computadora,
             la cual elige su jugada de manera aleatoria.
Autor: Joshua David Ortiz Rosas
Fecha de creación: 21/08/2025
Fecha última modificación: 23/08/2025
*/

// Importamos la librería de Kotlin que permite generar números aleatorios
import kotlin.random.Random

fun main() {
    // La computadora elige aleatoriamente
    val computadora = eleccionComputadora()
    // El usuario ingresa su elección (validada)
    val usuario = eleccionUsuario()
    // Determinamos el resultado
    val resultado = ganador(usuario, computadora)

    // Mostramos elecciones y resultado
    println("Tú elegiste: $usuario")
    println("La computadora eligió: $computadora")
    println("Resultado: $resultado")
}

// Función: elección aleatoria de la computadora
fun eleccionComputadora(): String {
    val opciones = arrayOf("Piedra", "Papel", "Tijera")
    val indice = Random.nextInt(opciones.size) // genera 0, 1 o 2
    return opciones[indice]
}

// Función: leer opción del usuario y normalizar
fun eleccionUsuario(): String {
    var opcion: String
    do {
        print("Elige una opción (Piedra, Papel o Tijera): ")
        opcion = readln()
        // Normalizamos: quitamos espacios y convertimos a primera mayúscula
        opcion = opcion.trim().lowercase().replaceFirstChar { it.uppercase() }
    } while (opcion !in listOf("Piedra", "Papel", "Tijera")) // validamos
    return opcion
}

// Función: determinar quién gana
fun ganador(usuario: String, computadora: String): String {
    return if (usuario == computadora) {
        "Empate"
    } else if (
        (usuario == "Piedra" && computadora == "Tijera") ||
        (usuario == "Tijera" && computadora == "Papel") ||
        (usuario == "Papel" && computadora == "Piedra")
    ) {
        "¡Ganaste!"
    } else {
        "Perdiste"
    }
}


