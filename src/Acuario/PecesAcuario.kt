package Acuario

abstract class Pez(val color: String, val nombre: String) {
    abstract fun imprimir()
}

class Tiburon(color: String) : Pez(color) {
    override fun imprimir() {
        println("El tiburón es de color: ${color}")
    }
}

class PezPayaso : Pez() {
    override val color: String = "dorado"
    override val nombre: String = "nemo"
    override fun imprimir() {
        println("El pez payaso es de color: ${color}")
    }
}