fun main() {
    var celcius: Double

    print("Digite a temperatura em graus Celcius: ")
    celcius = readln().toDouble()

    println("Fahrenheit: ${celsiusToFahrenheit(celcius)}")
}

fun celsiusToFahrenheit(celcius: Double): Double {
    return (celcius * 1.8) + 32
}