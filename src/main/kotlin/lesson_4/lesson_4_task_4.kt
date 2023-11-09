package lesson_4

fun main() {
    var day = 5
    var even = day % 2 == 0

    println(
        """
        Упражнения для рук:    ${!even}
        Упражнения для ног:    $even
        Упражнения для спины:  $even
        Упражнения для пресса: ${!even}
    """.trimIndent()
    )

}