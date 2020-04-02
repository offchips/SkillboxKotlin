package com.example.kotlin

fun main() {
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return

    println("Вы ввели число: $n")
//    println("Сумма с помощью while = ${calculateSumByWhile(n)}")
//    println("Сумма с помощью while и return = ${calculateSumByWhileInfiniteReturn(n)}")
//    println("Сумма с помощью while и break = ${calculateSumByWhileInfiniteBreak(n)}")
//
////    printEverNumbers(n)
//
//    println("Сумма с помощью do while = ${calculateSumDoWhile(n)}")
//    println("Сумма с помощью for = ${calculateSumFor(n)}")
//
//    printChars()
//    printEverNumberFor(n)
//    printBackEverNumberFor(n)

    printTest(n)
}

fun calculateSumByWhile(n: Int):Long{
    var sum: Long = 0
    var currentNumber: Int = 0
    while (currentNumber <= n){
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun calculateSumByWhileInfiniteReturn(n: Int):Long{
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true){
        if (currentNumber > n) return sum
        sum += currentNumber
        currentNumber++
    }
}

fun calculateSumByWhileInfiniteBreak(n: Int):Long{
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true){
        if (currentNumber > n) break
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun printEverNumbers(n:Int){
    var currentNumber = 0
    while (currentNumber<=n){
        val numberBefore :Int = currentNumber
        currentNumber++
        if (numberBefore %2 == 1) continue
        println(numberBefore)
    }
}

fun calculateSumDoWhile(n:Int):Long{
    var sum: Long = 0
    var currentNumber: Int = 0
    do {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }while (currentNumber <= n)
    return sum
}

fun calculateSumFor(n:Int):Long{
    var sum: Long = 0

    val range: IntRange = 0 .. n

    for (currentNumber:Int in range){
        sum += currentNumber
    }

    return sum
}

fun printChars(){
    for (currentCh:Char in "string"){
        println(currentCh)
    }
}

fun printEverNumberFor(n:Int){
    val range = 0..n step 2
    for (currentNumber in range){
        println(currentNumber)
    }
}

fun printBackEverNumberFor(n:Int){
    val range = n downTo 0 step 2
    for (currentNumber in range){
        println(currentNumber)
    }
}
fun printTest(n:Int){
    val range = 0..n step 2
    for (i in range){
        println(i)
    }
}