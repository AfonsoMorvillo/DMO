fun main() {
    var custoFabrica: Double

    print("Custo de fábrica: R$");
    custoFabrica = readln().toDouble()

    var porcentagensCalculo = porcentagensCalculo(custoFabrica)

    var precoConsumidor = ( porcentagensCalculo.impostos * custoFabrica ) + ( porcentagensCalculo.distribuidor * custoFabrica ) + custoFabrica

    print("Preço ao consumidor: R$$precoConsumidor");
}

class porcentagensCalculo {
    var distribuidor: Double
    var impostos: Double

    constructor(valorDeFabrica: Double) {
        this.distribuidor = getPercentualDistribuidor(valorDeFabrica)
        this.impostos = getPercentualImposto(valorDeFabrica)
    }


    private fun getPercentualDistribuidor(valor: Double): Double {
        if (valor < 50000) {
            return 0.05
        } else if (valor < 80000) {
            return 0.10
        }

        return 0.15
    }

    private fun getPercentualImposto(valor: Double): Double {
        if (valor < 50000) {
            return 0.00
        } else if (valor < 80000) {
            return 0.15
        }

        return 0.20
    }
}



