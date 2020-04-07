package com.example.a03_kotlinbasic

fun main() {
    println("Введите положительное число: ")
    while (true) {
        val number = readLine()?.toIntOrNull()
        if (number !is Int || number < 0) {
            println("Вы ввели не число или ваше число отрицательное. Повторите попытку")
            continue
        } else {
            val list = inputMutableList(number)
            println("Количество положительных чисел = ${countPlus(list)}")
            println("Чётные числа: ${list.filter { it % 2 == 0 }}")
            println("Количество уникальных чисел: ${list.toSet().size}")
            val sum = list.sum()
            val map = mutableMapOf<Int, Int>()
            for (currentNum in list) {
                map.put(currentNum, gcd(currentNum, sum))
            }
            map.forEach { println("Число <${it.key}>, Сумма <$sum>, НОД <${it.value}>") }
            break
        }
    }
}

fun inputMutableList(n: Int): List<Int> {
    var list = mutableListOf<Int>()
    while (true) {
        println("Введите очередное число: ")
        readLine()?.toIntOrNull()
            ?.let { number -> list.add(number) }
            ?: println("Вы ввели не число! Попробуйте снова!")
        if (n == list.size) break
    }
    return list
}

fun countPlus(list: List<Int>): Int {
    var countPlus = 0
    for (currentInt in list) {
        if (currentInt > 0) countPlus += 1
    }
    return countPlus
}

tailrec fun gcd(currentNum: Int, sum: Int): Int {
    if (sum == 0) return currentNum
    return gcd(sum, currentNum % sum)
}