package lesson_4

fun main() {
    val isSunny = true
    val isOpen = true
    val humidity = 20
    val season = "winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${isSunny && isOpen && humidity == 20 && season != "winter"}"
    )
}