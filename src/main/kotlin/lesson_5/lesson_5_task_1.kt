package lesson_5

fun main() {
    println("Здравствуйте! Проверка, что вы не бот.")
    println("Введите целое число до 100.")
    val number1 = readLine()!!.toInt()
    println("Введите второе целое число до 100.")
    val number2 = readLine()!!.toInt()
    println("Введите сумму ваших чисел.")
    val sum = readLine()!!.toInt()
    val answer =
        if (number1 + number2 == sum)  "Добро пожаловать!"
        else "Доступ запрещен."

    println(answer)

}