import java.time.LocalDate

fun main() {
    val cliente = Cliente("Mario Vitor", "São Jose", "16997241234", "20/02/2001")

    println(cliente)
}

class Cliente(var nome: String,var endereco: String, var telefone: String, var dataNascimento: String) {

    override fun toString(): String {
        return "nome: $nome; endereco: $endereco; telefone: $telefone; dataNascimento: $dataNascimento"
    }
}