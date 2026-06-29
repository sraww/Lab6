fun main() {
    // Запрос строки у пользователя
    println("Введите строку:")
    val inputString = readLine()

    if (inputString.isNullOrBlank()) {
        println("Вы не ввели ни слова.")
        return
    }

    // Разделение строки на слова по пробелам
    val words = inputString.trim().split("\\s+".toRegex())

    // Подсчет количества слов
    val wordCount = words.size

    // Вывод результата
    println("Количество слов в строке: $wordCount")
}