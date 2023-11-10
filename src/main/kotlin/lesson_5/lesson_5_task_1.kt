package lesson_5

fun main() {
    println("Здравствуйте! Проверка, что вы не бот.")
    val number1 = (0..100).random()
    val number2 = (0..100).random()
    println("Введите сумму чисел: $number1 + $number2")
    val sum = readln().toInt()
    val answer =
        if (number1 + number2 == sum)  "Добро пожаловать!"
        else "Доступ запрещен."

    println(answer)

}