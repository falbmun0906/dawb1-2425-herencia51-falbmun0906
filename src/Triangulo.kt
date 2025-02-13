class Triangulo(val base: Double, val altura: Double, color: String) : Figura(color) {

    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double? {
        print("ERROR: No se puede calcular el perímetro de un triángulo a partir de su base y altura.\n")
        return null
    }

}