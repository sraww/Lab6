fun main() {
    val words = listOf("cat", "elephant", "dog", "kotlin")
    val longWords = words.count { it.length > 3 }
    println(longWords)
}