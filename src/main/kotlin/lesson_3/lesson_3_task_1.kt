package lesson_3

fun main() {

    val greeting = "Добрый"
    val day = "день"
    val evening = "вечер"
    val name = "Сергей"
    var greetingTime = "$greeting $day, $name!"

    println(greetingTime)

    greetingTime = "$greeting $evening, $name!"

    println(greetingTime)

}