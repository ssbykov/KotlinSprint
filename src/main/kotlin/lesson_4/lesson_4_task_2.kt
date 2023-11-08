package lesson_4

fun main() {
    val min_weight = 35
    val max_weight = 100
    val max_volume = 100

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    println(
        "Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': " +
                "${weight1 >= min_weight && weight1 <= max_weight && volume1 < max_volume}"
    )

    println(
        "Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': " +
                "${weight2 >= min_weight && weight2 <= max_weight && volume2 < max_volume}"
    )
}