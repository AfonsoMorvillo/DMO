fun main() {
    var numero: Int

    print("Digite um número: ");
    numero = readln().toInt()

    ehPrimo(numero)
}

private fun ehPrimo(numero: Int) {
    for (i in 2..numero) {
        if (i != numero && ((numero % i) == 0)) {
            println("Não é primo")
            return
        }
    }
    println("Primo!")
}