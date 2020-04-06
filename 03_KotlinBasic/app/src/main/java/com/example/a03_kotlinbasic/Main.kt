package com.example.a03_kotlinbasic

fun main() {
    val mutableList = mutableListOf<Int>()
    val mutableSet = mutableSetOf<Int>()
    val mapNNod: MutableMap<Int, Int> = mutableMapOf()
    while (true) {
        print("Введите число: ")
        var n: Int = readLine()?.toIntOrNull() ?: continue
        println("Вы ввели число: $n")
        mutableList.add(n)
        println("Основной список = $mutableList")
        println("Количество положительных чисел = ${countPlus(n, mutableList)}")
        println("Четные числа = ${evenNumber(mutableList)}")
        println("Количество уникальных введенных чисел = ${numberOfUniqueNumbers(n, mutableSet)}")
        println("Сумма всех введенных чисел = ${mutableList.sum()}")
        for (currentInt: Int in mutableList) {
            mapNNod.put(n, gcd(n, mutableList.sum()))
        }
        for (key in mapNNod.keys) {
            println("Число = $key, Сумма = ${mutableList.sum()}, НОД = ${mapNNod[key]}")
        }
        println("-----------------------------------------------------------------------------")
    }
}

fun countPlus(n: Int, mutableList: MutableList<Int>): Int {
    var countPlus = 0
    for (currentInt: Int in mutableList) {
        if (n > 0) countPlus += 1
    }
    return countPlus
}

fun evenNumber(mutableList: MutableList<Int>): List<Int> {
    val evenNumber = mutableList.filter { it % 2 == 0 && it != 0 }
    return evenNumber
}

fun numberOfUniqueNumbers(n: Int, mutableSet: MutableSet<Int>): Int {
    mutableSet.add(n)
    return mutableSet.size
}

tailrec fun gcd(n: Int, b: Int): Int {
    if (b == 0) return n
    return gcd(b, n % b)
}