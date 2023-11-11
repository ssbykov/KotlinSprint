package lesson_5

const val MIN_NUMBER = 0
const val MAX_NUMBER = 42

fun main() {
    val numbers = IntArray(3) { (MIN_NUMBER..MAX_NUMBER).random() }
    println("Введите три числа через пробел в диапазоне от ${MIN_NUMBER} до ${MAX_NUMBER}:")
    val inNumbers = readln().split(" ").map { it.toInt() }
    val result = when (numbers.intersect(inNumbers).size) {
        3 -> "Вы выйграли джекпот!"
        2 -> "Вы угадали два числа и получаете крупный приз!"
        1 -> "Вы угадали одно число и получаете утешительный приз приз!"
        else -> "Вы не угадали ни одного числа"
    }
    println(result)
    println(numbers.joinToString(", " ))
}