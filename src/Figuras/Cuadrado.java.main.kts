package Figuras

class Triangulo {
    var base: Double = 0.0
    var altura: Double = 0.0

    fun CalcularAreaTriangulo(base: Double, altura: Double) {
        this.base = base
        this.altura = altura
    }

    fun CalcularArea(): Double {
        return (base * altura) / 2
    }
}