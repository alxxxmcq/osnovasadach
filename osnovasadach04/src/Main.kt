fun main() {
    print("Введите выражение (например: 5 3 +): ")
    val input = readLine()?.split(" ") ?: return

    if (input.size != 3) {
        println("Ошибка: нужно ввести 2 числа и операцию через пробел")
        return
    }

    val a = input[0].toDoubleOrNull()
    val b = input[1].toDoubleOrNull()
    val op = input[2]

    if (a == null || b == null) {
        println("Ошибка: неверные числа")
        return
    }

    val result = when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else "Ошибка: деление на ноль"
        else -> "Ошибка: неизвестная операция"
    }

    println("Результат: $result")
}