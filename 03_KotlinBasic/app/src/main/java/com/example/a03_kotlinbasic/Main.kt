package com.example.a03_kotlinbasic

val mutableList = mutableListOf<Int>()
val mutableSet = mutableSetOf<Int>()
var countPlus: Int = 0
var nod: Int = 0

val mapNNod: MutableMap<Int, Int> = mutableMapOf()

fun main() {
    while (true) {
        print("Введите число: ")
        var n: Int = readLine()?.toIntOrNull() ?: continue
        println("Вы ввели число: $n")
        listN(n)
        println(mutableList)
        countPlus(n)
        evenNumber()
        numberOfUniqueNumbers(n)
        println(calculateSumFor(n))
    }
}

fun listN(n: Int) {
    mutableList.add(n)
}

fun countPlus(n: Int) {
    if (n > 0) {
        countPlus = countPlus + 1
    }
    println("Количество положительных чисел = $countPlus")
}

fun evenNumber() {
    val evenNumber = mutableList.filter { it % 2 == 0 && it != 0 }
    println("Четные числа = $evenNumber")
}

fun numberOfUniqueNumbers(n: Int) {
    mutableSet.add(n)
    println("Количество уникальных введенных чисел = ${mutableSet.size}")
}

fun calculateSumFor(n: Int) {
    var sum: Int = 0
    for (currentNumber: Int in mutableList) {
        sum += currentNumber
    }
    println("Сумма всех введенных чисел = $sum")
    println("НОД = " + gcd(n, sum))
    mapNNod.put(n, nod)
    for (key in mapNNod.keys) {
        println("Число = $key, Сумма = $sum, НОД = ${mapNNod[key]}")
    }
}

tailrec fun gcd(n: Int, b: Int): Int {
    if (b == 0) {
        nod = n
        return n
    }
    return gcd(b, n % b)
}