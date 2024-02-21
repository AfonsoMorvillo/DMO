fun main() {
    var numero: Int
    var fatorial: Int = 0
    var cont: Int

    do {
        print("Digite um número inteiro positivo: ");
        numero = readln().toInt()
        cont = numero
    }while (numero < 0)

    fatorial = fatorial(numero)

    println("Fatorial = $fatorial")
}

fun fatorial(n: Int): Int {
    return if (n <= 1) {
        1
    } else {
        n * fatorial(n - 1)
    }
}

