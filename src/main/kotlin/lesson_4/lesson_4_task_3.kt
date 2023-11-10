package lesson_4

const val isSunny = true
const val isOpen = true
const val humidity = 20
const val season = "winter"

fun main() {


    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${isSunny && isOpen && humidity == 20 && season != "winter"}"
    )
}