package com.example.kotlin

fun main() {
    val mutableList = mutableListOf("1", "42", "3") //изменяемый список (ListOf<>() - неизменяемый)
    println(mutableList)

    mutableList[0]

    mutableList.forEach{(println(it))}

    val emptyList = emptyList<String>()

    mutableList[0] = "1.2"
    println(mutableList)

    mutableList.removeAt(0)
    mutableList.add("4")
    mutableList.add(1, "new 1")
    println(mutableList)

    mutableList.addAll(listOf("10", "20"))
    println(mutableList)
}