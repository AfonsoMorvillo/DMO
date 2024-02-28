fun main() {
    val funcionario = Funcionario("Lucas", "123.123.132.132", "Basico",)
    println("Salario funcionario: ${funcionario.calcularBeneficios()}")

    val empregado = Empregado("Lucas", "123.123.132.132", "Desenvolvedor",3000.0, "24/04/2021")
    println("Salario empregado: ${empregado.calcularBeneficios()}")

    val gerente = Gerente("Andre", "123.123.123.123", "Analista",7000.0, "24/04/2025",1000.0)
    println("Salario gerente: ${gerente.calcularBeneficios()}")

    val estagiario = Estagiario("Vitor", "15.15.15.15", "Estagiario em desenvolvimento", 1300.0, "IFSP")
    println("Salario estagiario: ${estagiario.calcularBeneficios()}")
}

open class Funcionario(var none: String, var cpf: String, var cargo: String) {

    open fun calcularBeneficios(): Double {
        return 0.0
    }

}

open class Empregado(nome: String, cpf: String, cargo: String, var salario: Double, var dataAdmissao: String) :
    Funcionario(nome, cpf, cargo) {
    override fun calcularBeneficios(): Double {
        return salario
    }
}

class Gerente(nome: String, cpf: String, cargo: String, salario: Double, dataAdmissao: String, var bonus: Double) :
    Empregado(nome, cpf, cargo, salario, dataAdmissao) {
    override fun calcularBeneficios(): Double {
        return super.calcularBeneficios() + bonus
    }
}

class Estagiario(nome: String, cpf: String, cargo: String, var bolsaAuxilio: Double, var instituicaoEnsino: String) :
    Funcionario(nome, cpf, cargo) {
    override fun calcularBeneficios(): Double {
        return super.calcularBeneficios() + bolsaAuxilio
    }
}





