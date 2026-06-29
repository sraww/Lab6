fun main() {
    val phoneBook = mutableMapOf(
        "Анна" to "+7 900 000 00 01",
        "Игорь" to "+7 900 000 00 02"
    )
    phoneBook["Мария"] = "+7 900 000 00 03"
    println(phoneBook)
}