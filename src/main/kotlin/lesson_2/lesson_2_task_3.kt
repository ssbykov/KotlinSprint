package lesson_2

fun main() {
    val hours = 9
    val minutes = 39
    val travelTime = 457

    println("${((hours * 60 + minutes + travelTime) / 60) % 24}:${(minutes + 457) % 60}")
}