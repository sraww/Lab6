fun main() {
    // Запрос количества элементов массива
    println("Введите количество элементов массива:")
    val sizeInput = readLine()
    val size = sizeInput?.toIntOrNull() ?: run {
        println("Некорректный ввод количества элементов.")
        return
    }

    val array = IntArray(size)

    // Ввод элементов массива
    for (i in 0 until size) {
        println("Введите элемент ${i + 1}:")
        val elementInput = readLine()
        val element = elementInput?.toIntOrNull() ?: run {
            println("Некорректный ввод элемента.")
            return
        }
        array[i] = element
    }

    // Подсчет четных элементов
    val evenCount = array.count { it % 2 == 0 }

    // Вывод результата
    println("Количество четных элементов: $evenCount")
}