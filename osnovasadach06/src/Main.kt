fun main() {
    print("Введите первую цифру: ")
    val a = readLine()?.toIntOrNull() ?: return

    print("Введите вторую цифру: ")
    val b = readLine()?.toIntOrNull() ?: return

    if (a !in 0..9 || b !in 0..9) {
        println("Нужно ввести цифры от 0 до 9")
        return
    }

    if (a == b) {
        println("Цифры должны быть разными")
        return
    }

    val num1 = a * 10 + b
    val num2 = b * 10 + a

    if (num1 % 2 == 1) {
        println(num1)
    } else if (num2 % 2 == 1) {
        println(num2)
    } else {
        println("Создать нечетное число невозможно")
    }
}