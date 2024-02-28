fun main() {
    var peso: Double
    var altura: Double

    print("Peso em kilos: ");
    peso = readln().toDouble()

    print("Altura em metros: ");
    altura = readln().toDouble()

    println("IMC: ${calculaImc(peso, altura)}")
}

fun calculaImc(peso: Double, altura: Double): Double {
    return peso.div((altura * altura))
}