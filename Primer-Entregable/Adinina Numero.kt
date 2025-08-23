/*
Descripción: Juego en el que el usuario debe adivinar un número aleatorio
             entre 1 y 30 en un máximo de 5 intentos, con pistas de mayor o menor.
Autor: Joshua David Ortiz Rosas
Fecha de creación: 21/08/2025
Fecha última modificación: 23/08/2025
*/

// Importamos la librería de Kotlin que permite generar números aleatorios
import kotlin.random.Random

fun main() {
    // Se genera un número aleatorio entre 1 y 30
    // (el 31 es exclusivo, por eso el rango es 1..30)
    val numeroSecreto = Random.nextInt(1, 31)

    println("Adivina el número (entre 1 y 30). Tienes 5 intentos:")

    // El jugador tiene hasta 5 intentos para adivinar
    for (intento in 1..5) {
        print("Intento $intento: ")
        val numeroUsuario = readLine()!!.toInt() // Se lee el número ingresado y se convierte a entero

        // Caso 1: Adivinó el número secreto
        if (numeroUsuario == numeroSecreto) {
            println("¡Felicidades! Adivinaste el número en $intento intentos.")
            return // Termina el programa inmediatamente
        }
        // Caso 2: El número ingresado es menor que el secreto
        else if (numeroUsuario < numeroSecreto) {
            println("El número secreto es MAYOR.")
        }
        // Caso 3: El número ingresado es mayor que el secreto
        else {
            println("El número secreto es MENOR.")
        }
    }

    // Si se gastaron los 5 intentos, se revela el número secreto
    println("Fallaste. El número era $numeroSecreto.")
}


