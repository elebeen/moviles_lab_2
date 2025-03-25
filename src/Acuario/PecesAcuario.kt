package Acuario

abstract class Pez(val color: String, val nombre: String) {
    abstract fun imprimir()
}

class Tiburon(color: String, nombre: String) : Pez(color, nombre) {
    override fun imprimir() {
        println("El tiburón se llama $nombre es de color: ${color}")
    }
}

class PezPayaso(color: String, nombre: String) : Pez(color, nombre) {
    override fun imprimir() {
        println("El pez payaso se llama $nombre es de color: ${color}")
    }
}