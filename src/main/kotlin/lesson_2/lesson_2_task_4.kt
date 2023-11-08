package lesson_2

fun main() {
    val bonus = 0.2
    val countCrystals = 7
    val countIron = 11

    println("кристаллической руды - ${(countCrystals * bonus).toInt()}")
    println("железной руды - ${(countIron * bonus).toInt()}")

}