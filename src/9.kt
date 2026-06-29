fun main() {
    val students = listOf("Анна", "Олег", "Ирина")
    for (index in students.indices) {
        println("${index + 1}. ${students[index]}")
    }
}