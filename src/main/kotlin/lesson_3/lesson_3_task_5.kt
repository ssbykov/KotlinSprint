package lesson_3

fun main() {
    val move = "D2-D4;0"
    val number= move.split(";")[1]
    val from = move.split("-")[0]
    val to = move.split("-")[1].split(";")[0]

    println(from)
    println(to)
    println(number)

}