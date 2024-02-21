fun main() {
    var salario: Double
    var conta1: Double
    var conta2: Double

    val multa = 1.02

    println("Valor do salario: ");
    salario = readln().toDouble()

    println("Valor da conta 1: ");
    conta1 = readln().toDouble()

    println("Valor da conta 2: ");
    conta2 = readln().toDouble()

    var valorRestante = salario - ((conta1 * multa) + (conta2 * multa))

    println("Salário restante: $valorRestante")

}