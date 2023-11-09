package lesson_3

fun main() {
    val move = "D2-D4;0"
    val (from, to, number) = move.split("-", ";")

    println(from)
    println(to)
    println(number)

}