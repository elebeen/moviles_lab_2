package Acuario

fun construirAcuario() {
    //val acuario1 = Acuario()
    //acuario1.imprimirTamano()

    //val acuario2 = Acuario(ancho = 25)
    //acuario2.imprimirTamano()

    //val acuario3 = Acuario(alto = 35, largo = 110)
    //acuario3.imprimirTamano()

    //val acuario4 = Acuario(ancho = 25, alto = 35, largo = 110)
    //acuario4.imprimirTamano()

    //val acuario6 = Acuario(numDePeces = 29)
    //acuario6.imprimirTamano()
    //println("Volumen: ${acuario6.ancho * acuario6.largo * acuario6.alto / 1000} l")

    //val acuario7 = Acuario(numDePeces = 29)
    //acuario7.imprimirTamano()
    //acuario7.volumen = 70
    //acuario7.imprimirTamano()

    //val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    //acuario8.imprimirTamano()

    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()
    val miTorre = Tanquetorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
}

fun crearPeces() {
    val tiburon = Tiburon()
    tiburon.imprimir()
    val pezpayaso = PezPayaso()
    pezpayaso.imprimir()

}

fun main() {
    construirAcuario()
    crearPeces()
}