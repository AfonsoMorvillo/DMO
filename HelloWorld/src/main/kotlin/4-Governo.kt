
fun main() {
    val percentualMaximo = 0.30

    var prestacao: Double
    var salario: Double

    print("Salário bruto: R$");
    salario = readln().toDouble()

    print("Valor prestacao: R$");
    prestacao = readln().toDouble()

    val salarioMaximo = salario * percentualMaximo;

    if (prestacao > salarioMaximo)  println("Empréstimo negado, prestação ultrapassa 30% do salário bruto") else println("Empréstimo concedido")

    println("Prestação: R$$prestacao")
    println("30% do salário: R$$salarioMaximo")


}