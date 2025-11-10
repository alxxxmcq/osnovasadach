fun main() {
    print("Введите число n: ")
    val n = readLine()?.toIntOrNull() ?: return

    print("Введите основание x: ")
    val x = readLine()?.toIntOrNull() ?: return

    if (x <= 1) {
        println("Основание должно быть больше 1")
        return
    }

    var y = 0
    var power = 1

    while (power < n) {
        power *= x
        y++
    }

    if (power == n) {
        println("y = $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}