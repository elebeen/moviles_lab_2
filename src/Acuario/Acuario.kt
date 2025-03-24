package Acuario
import kotlin.math.PI

open class Acuario(open var largo: Int = 100,open var ancho: Int = 20,open var alto: Int = 40) {

    //init {
        //println("inicializando acuario")
    //}

    //init {
        //println("Volumen ${ancho * largo * alto / 1000} litros")
    //}

    constructor(numDePeces: Int): this() {
        val tanque = numDePeces * 2000 * 1.1
        alto = (tanque / (largo * ancho)).toInt()
    }

    open var volumen: Int
        get() = ancho * alto * largo / 1000
        set(value) {
            alto = (value * 1000) / (ancho * largo)
        }

    open val forma = "rectangulo"

    open var agua: Double = 0.0
        get() = volumen * 0.9

    fun imprimirTamano() {
        println(forma)
        println("Ancho: $ancho cm " +
                "Largo: $largo cm " +
                "Alto: $alto cm ")
        println("Volumen: $volumen litros")
        println("Agua: $agua litros (${agua / volumen * 100.0}% lleno)")
    }
}

