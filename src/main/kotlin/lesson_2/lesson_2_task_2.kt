package lesson_2

fun main() {
    val employeesCount = 50
    val employeesSalary = 30000
    val internCount = 30
    val internSalary = 20000

    val sumEmployeesSalary = employeesCount * employeesSalary
    val sumSalary = sumEmployeesSalary + internSalary * internCount
    val averageSalary = sumSalary / (employeesCount + internCount)
}