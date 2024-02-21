fun main() {
    val gatos = 2
    var dias: Int = 5

    var racao: Int
    var qtdDiaria: Int

    println("Peso do saco de ração kilos: ");
    racao = readln().toInt() * 1000

    println("Quantidade diaria consumida pelos gatos em gramas: ");
    qtdDiaria = readln().toInt()

    while (dias != 0) {
        racao -= (qtdDiaria * 2)

        dias--
    }


    println("Após 5 dias restou $racao gramas de ração")


}

