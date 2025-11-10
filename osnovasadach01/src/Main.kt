fun main() {
    print("Введите строку: ")
    val input = readLine() ?: ""

    if (input.isEmpty()) {
        println("Пустая строка")
        return
    }

    var result = ""
    var count = 1

    for (i in input.indices) {
        if (i < input.length - 1 && input[i] == input[i + 1]) {
            count++
        } else {
            result += if (count > 1) "${input[i]}$count" else input[i]
            count = 1
        }
    }

    println("Результат: $result")
}