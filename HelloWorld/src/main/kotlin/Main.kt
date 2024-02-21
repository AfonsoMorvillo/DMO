fun main(args: Array<String>) {

    val name: String = "Fernando"
    val idade: Int = 48
    val fullName = name + " Duarte"
    val isLegalAge = idade >= 18

    //println(fullName)
    println("Maior de idade: $isLegalAge")

    val firstChar = name[0]
    val lastChar = name[name.length - 1]

    println("Primeiro caractere: $firstChar")
    println("Último caractere: " + lastChar)

    val message = String.format("Olá, %s!", fullName);
    println(message)

    val substring1 = fullName.substring(0, 8)
    println(substring1)



}