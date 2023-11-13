package lesson_4

const val MIN_TEAM_MEMBER = 55
const val MAX_TEAM_MEMBER = 70
const val MIN_PROVISIONS = 50

fun main() {
    print("Корабль не имеет повреждений? 1 - имеет/ 0 - не имеет: ")
    val isDamage = readlnOrNull() == "1"

    print("Введите количество членов экипажа: ")
    val numberOfCrew = readln().toInt()

    print("Введите количество ящиков провизии: ")
    val quantityOfProvisions = readln().toInt()

    print("Погода благоприятная? 1 - да/ 0 - нет: ")
    val isWeather = readlnOrNull() == "1"

    val isApproved =
        (!isDamage && numberOfCrew in (MIN_TEAM_MEMBER..MAX_TEAM_MEMBER)
                && quantityOfProvisions > MIN_PROVISIONS) ||
                (numberOfCrew == MAX_TEAM_MEMBER && quantityOfProvisions >= MIN_PROVISIONS && isWeather)


    println(isApproved)
}