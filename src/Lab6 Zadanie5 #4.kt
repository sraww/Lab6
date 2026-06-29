fun main() {
    // Запрос строки у пользователя
    println("Введите текст:")
    val inputText = readLine() ?: ""

    // Разделение текста на слова по пробелам и удаление лишних знаков препинания
    val words = inputText
        //.toLowerCase()
        .split("\\W+".toRegex()) // разделение по не алфавитным символам
        .filter { it.isNotBlank() } // удаление пустых элементов

    // Создается карта frequencyMap, где ключ — слово, а значение — его количество.
    val frequencyMap = mutableMapOf<String, Int>()
    for (word in words) {
        frequencyMap[word] = frequencyMap.getOrDefault(word, 0) + 1
    }

    // Вывод частот слов
    println("Частоты слов:")
    for ((word, count) in frequencyMap) {
        println("\"$word\" : $count")
    }
}