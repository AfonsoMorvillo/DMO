fun main() {
    var numero: Int

    print("Digite um numero: ");
    numero = readln().toInt()

    if (ehNumeroImpar(numero)) {
        println("Ímpar")
    } else {
        println("Par")
    }
}


fun ehNumeroImpar(numero: Int): Boolean {
    return numero % 2 != 0;
}