package Acuario
import kotlin.math.PI

class Tanquetorre (override var alto: Int, var diametro: Int):
    Acuario(alto = alto, ancho = diametro, largo = diametro) {
    override var volumen: Int
        get() = (ancho/2 * largo/2 * alto / 1000 * PI).toInt()
        set(value) {
            alto = ((value * 1000 / PI) / (ancho/2 * largo/2)).toInt()
        }
    override var agua = volumen * 0.8
    override val forma = "Cilindro"
}