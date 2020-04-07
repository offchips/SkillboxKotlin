package com.example.a03_kotlinbasic_02

fun main() {
    val list = mutableListOf<Int>()
    print("Введите число: ")
    var n: Int? = readLine()?.toIntOrNull()
    println("Вы ввели число: $n")
    var currentNumber: Int = 0
    if (n != null) {
        while (currentNumber <= n- 1){
            print("Введите число: ")
            var m: Int? = readLine()?.toIntOrNull() ?: continue
            println("Вы ввели число: $m")
            list.add(m!!)
            currentNumber++
        }
    }
    println(list)
}