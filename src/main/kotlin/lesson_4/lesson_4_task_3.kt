package lesson_4

const val IS_SUNNY = true
const val IS_OPEN = true
const val HUMIDITY = 20
const val SEASON = "winter"

fun main() {


    println(
        "Благоприятные ли условия сейчас для роста бобовых?" +
                " ${IS_SUNNY && IS_OPEN && HUMIDITY == 20 && SEASON != "winter"}"
    )
}