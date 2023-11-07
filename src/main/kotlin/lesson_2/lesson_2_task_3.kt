package lesson_2

fun main() {
    val arrivalTime = "9:39"
    val hours = arrivalTime.split(":")[0].toInt()
    val minutes = arrivalTime.split(":")[1].toInt()
    val travelTime = 457

    println("${((hours * 60 + minutes + travelTime) / 60) % 24}:${(minutes + 457) % 60}")
}