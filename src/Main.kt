fun main() {
    val c1 = Circulo(3.5, "Blanco")
    val r1 = Rectangulo(4.5, 3.5, "Amarillo")
    val t1 = Triangulo(10.0, 5.0, "Violeta")

    println("ÁREA DEL CÍRCULO 1: ${c1.area()}")
    println("ÁREA DEL TRIÁNGULO 1: ${t1.area()}")
    println("PERÍMETRO DEL TRIÁNGULO 1: ${t1.perimetro()}")
}