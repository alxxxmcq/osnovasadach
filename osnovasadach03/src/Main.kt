fun main() {
    print("Введите число: ")
    val number = readLine()?.toIntOrNull() ?: return

    var n = number
    var binary = ""

    while (n > 0) {
        binary = (n % 2).toString() + binary
        n /= 2
    }

    println("Двоичное: $binary")
}