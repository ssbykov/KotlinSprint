package lesson_5

import java.time.LocalDate

const val MIN_AGE = 18
fun main() {
    println("Введите год вашего рождения.")
    val year = readln().toInt()

    if (LocalDate.now().year - year >= MIN_AGE) println("Показать экран со скрытым контентом.")
}