fun main() {
    val limite = 4000000
    var anterior = 1
    var actual = 2
    var suma = 0

    while (actual <= limite) {
        if (actual % 2 == 0) {
            suma += actual
        }
        val siguiente = anterior + actual
        anterior = actual
        actual = siguiente
    }

    println("La suma de los valores pares en la secuencia de Fibonacci hasta $limite es: $suma")
}
