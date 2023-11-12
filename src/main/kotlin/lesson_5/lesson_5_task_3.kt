package lesson_5

const val NUMBER1 = 12
const val NUMBER2 = 33
fun main() {

    println("Введите два целых числа от 0 до 42")
    println("Введите первое число")
    val inNumber1 = readln().toInt()
    println("Введите первое число")
    val inNumber2 = readln().toInt()
    val result =
        if (NUMBER1 == inNumber1 && NUMBER2 == inNumber2 || NUMBER1 == inNumber2 && NUMBER2 == inNumber1)
            "Поздравляем! Вы выиграли главный приз!"
        else if (NUMBER1 != inNumber1 && NUMBER2 != inNumber2 && NUMBER1 != inNumber2 && NUMBER2 != inNumber1)
            "Неудача!"
        else
            "Вы выиграли утешительный приз!”"

    println(result)
    println("Выигрышные числа: $NUMBER1 и $NUMBER2")
}