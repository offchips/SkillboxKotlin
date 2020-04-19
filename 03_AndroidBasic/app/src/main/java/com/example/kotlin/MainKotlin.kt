package com.example.kotlin

fun main() {
    val shortVal: Short = 123
    val intVal = 123456789
    val longVal =123123132132L

    val floatVal = 123123.123f
    val doubleVal = 123123.123123123123

    val booleanVal: Boolean = true
    val booleanVal2: Boolean = false

    val booleanVal3 = booleanVal||booleanVal2
    val booleanVal4 = booleanVal&&booleanVal2

    val charVal: Char = '2'

    val name = "Ivan"
    val lastName = "Ivanov"
    val isMale = true

    val humanReadableName = "My name is ${name} and my lastname is ${lastName}"
    val humanReadableExpanded = "${if(isMale) "His" else "Her"} name is $name and my lastname is $lastName"
    println(humanReadableExpanded)

    println("")
    var x = 1
    while (x < 3) {
        print(if (x == 1) "Yab" else "Dab")
        print("ba")
        x = x + 1
    }
    if (x == 3) println("Do")
}