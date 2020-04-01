package com.example.kotlin

fun main() {
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return

    println("Вы ввели число: $n")
    println(calculateSumRecursiveTailRec(n))
}

//fun calculateSumRecursive(n: Int, i: Int):Int {
//    return if (n == 0) {
//        0
//    }else{
//        n + calculateSumRecursive((n - 1), accum + n)
//    }
//}

tailrec fun calculateSumRecursiveTailRec(n:Int, accum: Int = 0):Int {
    return if (n == 0) {
        accum
    }else{
        calculateSumRecursiveTailRec(n - 1, accum + n)
    }
}