class Triangulo(var base: Double = 0.0, var altura: Double = 0.0) {
    fun calcularArea(): Double {
        return (base * altura) / 2
    }
}

class Rombo(var diagonalMayor: Double = 0.0, var diagonalMenor: Double = 0.0) {
    fun calcularArea(): Double {
        return (diagonalMayor * diagonalMenor) / 2
    }
}

val triangulo = Triangulo()
triangulo.base = 6.0
triangulo.altura = 4.5

val rombo = Rombo()
rombo.diagonalMayor = 8.2
rombo.diagonalMenor = 3.6

println("El área de un triángulo es: ${triangulo.calcularArea()}")
println("El área de un rombo es: ${rombo.calcularArea()}")

