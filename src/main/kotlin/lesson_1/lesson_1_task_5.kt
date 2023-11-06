package lesson_1

fun main() {
    val flightLength: Short = 6480
    val hours = flightLength / 3600
    val minutes = (flightLength % 3600) / 60
    val seconds = (flightLength % 3600) % 60

    println("${"%02d".format(hours)}:${"%02d".format(minutes)}:${"%02d".format(seconds)}")

}