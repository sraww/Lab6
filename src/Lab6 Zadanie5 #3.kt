fun main() {
    // Запрос количества элементов списка
    println("Введите количество элементов списка:")
    val sizeInput = readLine()
    val size = sizeInput?.toIntOrNull() ?: run {
        println("Некорректный ввод количества элементов.")
        return
    }

    // Создание пустого списка для строк
    val stringList = mutableListOf<String>()

    // Ввод строк
    for (i in 1..size) {
        println("Введите строку ${i}:")
        val str = readLine() ?: ""
        stringList.add(str)
    }

    if (stringList.isEmpty()) {
        println("Список пуст.")
        return
    }

    // Нахождение самой короткой строки
    val shortestString = stringList.minByOrNull { it.length } ?: ""

    // Вывод результата
    println("Самая короткая строка: \"$shortestString\"")
}