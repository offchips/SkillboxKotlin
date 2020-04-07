package com.example.a03_kotlinbasic_02

fun main() {

    print("Введите число: ")
    var n: Int? = readLine()?.toIntOrNull()
    if (n != null) {
        println("Вы ввели число: $n")
        println(inputMutableList(n))
    }else println("Вы ввели не число!")
    val a = 0
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

