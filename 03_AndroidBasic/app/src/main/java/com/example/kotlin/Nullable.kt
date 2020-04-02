package com.example.kotlin

fun main() {
    val string:String = "string"
    val nullableString: String? = null
//
//    println(string.length)
//    println(nullableString?.length)
//
//    val lenght: Int = string.length
//    val nullableLength: Int? = nullableString?.length
//
//    nullableString?.reversed()
//        ?.find { it == '4' }
//        ?.isDigit()
//
    println("String length is ${nullableString?.length ?: "incorrect"}")

//    readLine()?.toIntOrNull()
//        ?.let { number -> println("Вы ввели число $number") }
//        ?:println("Вы ввели не число")

//    printLength("fdac")

    val a: Int? = 5
    a?.let { number -> print(number) }
}


fun printLength(string: String?){
    string?:return
    print("Длина строки = ${string.length}")
}

fun printLength2(string: String?){
    print("Длина строки = ${string!!.length}")
}