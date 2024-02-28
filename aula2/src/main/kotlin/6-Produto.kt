fun main() {

    val produto = Produto("Lego", 15.50, "Carro de lego", 10)
    println(produto)

    val produto2 = Produto("Novo produto")
    println(produto2)
}

class Produto(var nome: String, var preco: Double, var descricao: String, var quantidade: Int) {

    constructor(nome: String) : this (nome,0.0,"",0)

    override fun toString(): String {
        return "nome: $nome; preço: $preco; descricao: $descricao; quantidade: $quantidade"
    }

}