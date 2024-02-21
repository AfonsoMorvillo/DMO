fun main() {
    var custo: Int;
    var precoConvite: Int


    println("Custo do espetáculo: ");
    custo = readln().toInt()

    println("Preço do convite: ");
    precoConvite = readln().toInt()

    var qtdMinima = custo / precoConvite

    println("Quantidade de convites a serem vendidos $qtdMinima")


}