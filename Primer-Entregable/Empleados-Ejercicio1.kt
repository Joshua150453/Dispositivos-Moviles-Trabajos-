/*
Descripción: Programa que calcula el nivel de rendimiento y la cantidad de dinero recibido
             según el salario y la puntuación de un empleado.
Autor: Joshua David Ortiz Rosas
Fecha de creación: 21/08/2025
Fecha última modificación: 21/08/2025
*/

fun main() {
    // Entrada de datos
    print("Ingrese su salario mensual: ")
    val salario = readLine()!!.toDouble()

    print("Ingrese su puntuación (0 a 10): ")
    val puntuacion = readLine()!!.toInt()

    // Procesamiento
    val nivel = obtenerNivel(puntuacion)
    val dinero = calcularDinero(salario, puntuacion)

    // Salida
    println("Nivel de Rendimiento: $nivel")
    println("Cantidad de Dinero Recibido: $${"%.2f".format(dinero)}")
}

// Función que determina el nivel según la puntuación
fun obtenerNivel(puntuacion: Int): String {
    return when (puntuacion) {
        in 0..3 -> "Inaceptable"
        in 4..6 -> "Aceptable"
        in 7..10 -> "Meritorio"
        else -> "Puntuación inválida"
    }
}

// Función que calcula la cantidad de dinero
fun calcularDinero(salario: Double, puntuacion: Int): Double {
    return if (puntuacion in 0..10) {
        salario * (puntuacion.toDouble() / 10)
    } else 0.0
}
