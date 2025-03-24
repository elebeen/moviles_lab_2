package Acuario

class PecesAcuario {

}

abstract class Pez(open var color: String, open var nombre: String) {
    fun imprimir() {}
        
}

class tiburon(override var color: String, var nombre: String) {
    
}

class PezPayaso {

}