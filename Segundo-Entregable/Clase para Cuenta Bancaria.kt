package `Practica 2 - Programacion Orientada a Objetos Kotlin`

/*
    Autor: Joshua david Ortiz Rosas
    Curso: Programacion De Dispositivos Moviles
    Semestre: VI
    Fecha: 28/08/2025
    Ultima modificacion: 30/03/2025
*/

// Clase que modela una cuenta bancaria simple
class CuentaBancaria(
    private var saldo: Double,        // Saldo actual de la cuenta
    private var limiteRetiro: Double  // Límite máximo que se puede retirar en una sola operación
) {
    init {
        // Validaciones iniciales para asegurar que la cuenta se cree con datos válidos
        require(saldo >= 0) { "El saldo no puede ser negativo." }
        require(limiteRetiro > 0) { "El límite de retiro debe ser mayor que 0." }
    }

    // Propiedad pública para acceder y modificar el saldo, con validación
    var saldoActual: Double
        get() = saldo
        set(value) {
            require(value >= 0) { "El saldo no puede ser negativo." }
            saldo = value
        }

    // Propiedad pública para acceder y modificar el límite de retiro, con validación
    var limiteDeRetiro: Double
        get() = limiteRetiro
        set(value) {
            require(value > 0) { "El límite de retiro debe ser mayor que 0." }
            limiteRetiro = value
        }

    // Método que permite retirar dinero de la cuenta con validaciones
    fun retirar(monto: Double) {
        when {
            monto > saldo ->
                println("Saldo insuficiente. No puedes retirar más de lo que tienes.\n")
            monto > limiteRetiro ->
                println("No puedes retirar más del límite permitido.\n")
            else -> {
                saldo -= monto
                println("Retiro exitoso. Saldo restante: $saldo\n")
            }
        }
    }
}

fun main() {
    // Se pide al usuario el saldo inicial
    print("Ingrese saldo inicial: ")
    val saldoInicial = readLine()!!.toDouble()

    // Se pide el límite de retiro permitido
    print("Ingrese límite de retiro: ")
    val limite = readLine()!!.toDouble()

    // Se crea la cuenta bancaria con los valores dados por el usuario
    val cuenta = CuentaBancaria(saldoInicial, limite)

    // Primer intento de retiro
    print("Ingrese monto a retirar: ")
    val monto1 = readLine()!!.toDouble()
    cuenta.retirar(monto1)

    // Segundo intento de retiro
    print("Ingrese monto a retirar: ")
    val monto2 = readLine()!!.toDouble()
    cuenta.retirar(monto2)
}
