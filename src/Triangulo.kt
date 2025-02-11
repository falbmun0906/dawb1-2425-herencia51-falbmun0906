class Triangulo(color: String) : Figura(color) {

    constructor(ladoA: Double, ladoB: Double, ladoC: Double, color: String) : this(color)
    constructor(base: Double, altura: Double, color: String) : this(color) {}

    override fun area(): Double {
        TODO("Not yet implemented")
    }

    override fun perimetro(): Double {
        TODO("Not yet implemented")
    }

}