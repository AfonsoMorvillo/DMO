
fun main() {
    val pessoa1 = Pessoa("Ana", 15)
    pessoa1.saudacao()
    val pessoa2 = Pessoa("Juliana")
    pessoa2.saudacao()
}

class Pessoa (var nome: String, var idade: Int){
    // Sobrecarga de construtor
    constructor(nome: String) : this(nome, 0)
    fun saudacao() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}