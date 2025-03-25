package Acuario

abstract class Pez(val color: String, val nombre: String) {
    abstract fun imprimir()
}

class Tiburon(color: String, nombre: String) : Pez(color, nombre), AccionPez {
    override fun imprimir() {
        println("El tiburón se llama $nombre es de color: ${color}")
    }

    override fun comer() {
        println("El tiburon acecha a su presa para comerla")
    }
}

class PezPayaso(color: String, nombre: String) : Pez(color, nombre), AccionPez {
    override fun imprimir() {
        println("El pez payaso se llama $nombre es de color: ${color}")
    }

    override fun comer() {
        println("El pez come algas en el fondo marino")
    }
}

interface AccionPez {
    fun comer()
}