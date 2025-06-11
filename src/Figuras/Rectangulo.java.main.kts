package Figuras

class Rombo {
    var diagonalMayor: Double = 0.0
    var diagonalMenor: Double = 0.0

    fun CalcularAreaRombo(diagonalMayor: Double, diagonalMenor: Double) {
        this.diagonalMayor = diagonalMayor
        this.diagonalMenor = diagonalMenor
    }

    fun CalcularArea(): Double {
        return (diagonalMayor * diagonalMenor) / 2
    }
}