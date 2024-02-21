fun main() {
    var precoEtiqueta: Double
    var precoFinal: Double
    var formaPagamento: Int


    print("Preço da etiqueta: R$");
    precoEtiqueta = readln().toDouble()


    println("1 - Á vista em dinheiro ou cheque, recebe 10% de desconto.")
    println("2 - Á vista no cartão de crédito, recebe 5% de desconto.")
    println("3 - Em 2 vezes, preço normal da etiqueta sem juros.")
    println("4 - Em 3 vezes, preço normal da etiqueta mais juros de 10%.")
    print("Selecione a forma de pagamento: ")
    formaPagamento = readln().toInt()

    when (formaPagamento) {
        1 -> precoFinal = precoEtiqueta * 0.90
        2 -> precoFinal = precoEtiqueta * 0.95
        3 -> precoFinal = precoEtiqueta
        4 -> precoFinal = precoEtiqueta * 1.1
        else -> {
            precoFinal = 0.0
            println("Forma de pagamento não existe")
        }
    }

    println("Valor total: R$$precoFinal")


}
