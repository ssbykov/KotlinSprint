package lesson_5

const val NAME = "Zaphod"
const val PASSWORD = "PanGalactic"

fun main() {
    println("Введите ваше имя:")
    val name = readln()
    if (name != NAME)
        return println("Вам необходимо зарегистрироваться")

    println("Введите ваш пароль:")
    val password = readln()

    if (password == PASSWORD) println("Добро пожаловать на борт!")


}