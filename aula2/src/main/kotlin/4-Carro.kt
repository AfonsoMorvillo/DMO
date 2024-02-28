fun main() {
    val carro = Carro("Honda","Civic",2015,"AYAG-8794")

    println(carro)
}

class Carro(var marca: String, var modelo: String, var ano: Int, var placa: String) {

    override fun toString(): String {
        return "Marca: $marca; Modelo: $modelo; Ano: $ano; Placa: $placa"
    }

}