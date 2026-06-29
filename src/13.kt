fun main() {
    val numbers = listOf(3, 8, 1, 10, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val doubledNumbers = numbers.map { it * 2 }
    println(evenNumbers)
    println(doubledNumbers)
}