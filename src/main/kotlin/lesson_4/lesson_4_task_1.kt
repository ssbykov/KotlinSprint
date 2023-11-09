package lesson_4


fun main() {
    val count_tables = 13

    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9

    println(
        "[Доступность столиков на сегодня: ${count_tables > bookedTablesToday}],\n" +
                "[Доступность столиков на завтра: ${count_tables > bookedTablesTomorrow}]."
    )

}