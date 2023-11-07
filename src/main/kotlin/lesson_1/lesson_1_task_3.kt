package lesson_1

fun main() {
    val year = 1961
    val takeoffTime = "09:07"

    var hour = takeoffTime.split(":")[0]
    var minute = takeoffTime.split(":")[1]

    println(year)
    println(hour)
    println(minute)

    val landingTime = "10:55"

    hour = landingTime.split(":")[0]
    minute = landingTime.split(":")[1]

    println("Посадка – $hour:$minute")
}