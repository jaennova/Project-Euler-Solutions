fun main() {
    var sumaTotal: Int = 0
    for (i in 1..1000) {

        if (i % 3 == 0 || i % 5 == 0) {
            sumaTotal +=i
        }
    }
    println(sumaTotal)
}
