fun main() {
    val text = "kotlin kotlin mobile app mobile"
    val words = text.split(" ")
    val frequency = mutableMapOf<String, Int>()
    for (word in words) {
        frequency[word] = frequency.getOrDefault(word, 0) + 1
    }
    println(frequency)
}