fun main() {
    print("Введите строку: ")
    val input = readLine() ?: ""

    val counts = mutableMapOf<Char, Int>()

    for (char in input) {
        counts[char] = counts.getOrDefault(char, 0) + 1
    }

    for ((char, count) in counts.toSortedMap()) {
        println("$char - $count")
    }
}