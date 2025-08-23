/*
Descripción: Calculadora básica con operaciones de suma, resta,
             multiplicación y división. Incluye menú con opción salir.
Autor: Joshua David Ortiz Rosas
Fecha de creación: 21/08/2025
Fecha última modificación: 23/08/2025
*/

fun main() {
    var opcion: Int   // Variable que guarda la opción elegida por el usuario

    // Bucle que repite el menú hasta que el usuario elija salir
    do {
        println("==== Menú ====")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicación")
        println("4. División")
        println("5. Salir")
        print("Elija una opción: ")
        opcion = readLine()!!.toInt() // Leemos la opción y la convertimos a entero

        // Si la opción está entre 1 y 4, se piden dos números
        if (opcion in 1..4) {
            print("Ingrese el primer número: ")
            val num1 = readLine()!!.toDouble()
            print("Ingrese el segundo número: ")
            val num2 = readLine()!!.toDouble()

            // Dependiendo de la opción, se llama a la función correspondiente
            if (opcion == 1) {
                println("Resultado: ${suma(num1, num2)}")
            }
            if (opcion == 2) {
                println("Resultado: ${resta(num1, num2)}")
            }
            if (opcion == 3) {
                println("Resultado: ${multiplicacion(num1, num2)}")
            }
            if (opcion == 4) {
                // Se valida que el segundo número no sea 0 antes de dividir
                if (num2 != 0.0) {
                    println("Resultado: ${division(num1, num2)}")
                } else {
                    println("Error: No se puede dividir entre 0")
                }
            }
        } else if (opcion != 5) {
            // Si el usuario no ingresa una opción válida (1..5), se muestra error
            println("Opción inválida, intente de nuevo.")
        }

        println() // Salto de línea para mejor presentación

    } while (opcion != 5) // El menú se repite hasta que se elija 5

    println("Saliendo de la calculadora...")
}

// Funciones básicas de la calculadora
fun suma(a: Double, b: Double) = a + b
fun resta(a: Double, b: Double) = a - b
fun multiplicacion(a: Double, b: Double) = a * b
fun division(a: Double, b: Double) = a / b


