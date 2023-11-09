package lesson_4

fun main() {
    print("Корабль не имеет повреждений? 1 - имеет/ 0 - не имеет: ")
    val isDamage = readlnOrNull() == "1"
    print("Введите количество членов экипажа: ")
    val numberOfCrew = readlnOrNull()?.toInt()
    print("Введите количество ящиков провизии: ")
    val quantityOfProvisions = readLine()!!.toInt()
    print("Погода благоприятная? 1 - да/ 0 - нет: ")
    val isWeather = readlnOrNull() == "1"

    val approved =
        !isDamage && numberOfCrew in (55..70) && quantityOfProvisions > 50 && isWeather ||
                isDamage && numberOfCrew == 70 && quantityOfProvisions >= 50 && isWeather


    println(approved)
}