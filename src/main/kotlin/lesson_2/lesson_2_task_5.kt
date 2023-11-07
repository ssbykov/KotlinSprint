package lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70_000
    val rate = 16.7
    val years = 20

    val newSum = (sum * (1 + rate / 100).pow(years) * 1000).toInt() / 1000.0
    println(newSum)
}