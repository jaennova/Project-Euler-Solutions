fun main() {
    var numero = 600851475143L
    var factorPrimoMasGrande = 0L
    var divisor = 2L

    while (divisor * divisor <= numero) {
        if (numero % divisor == 0L) {
            factorPrimoMasGrande = divisor
            numero /= divisor
        } else {
            divisor++
        }
    }

    if (numero > factorPrimoMasGrande) {
        factorPrimoMasGrande = numero
    }

    println("El factor primo más grande de 600851475143 es: $factorPrimoMasGrande")
}
