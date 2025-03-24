package Acuario

class PecesAcuario {

}

abstract class Pez(open var color: String, open var nombre: String) {
    open val crearPez: String
        
}

class tiburon(override open var color: String, open var nombre: String) {

}

class PezPayaso {

}