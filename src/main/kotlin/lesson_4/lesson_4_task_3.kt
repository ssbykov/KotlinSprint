package lesson_4

const val IS_SUNNY = true
const val IS_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {

    val isSunny = true
    val isOpen = true
    val humidity = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${isSunny == IS_SUNNY && isOpen == IS_OPEN && humidity == HUMIDITY && season != SEASON}"
    )
}