class Rectangulo(val ladoA: Double,
                 val ladoB: Double,
                 color: String) : Figura(color) {

    override fun area(): Double {
        return ladoA * ladoB
    }

    override fun perimetro(): Double {
        return 2 * ladoA + 2 * ladoB
    }
}