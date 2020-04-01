package com.example.kotlin

import kotlin.random.Random

fun main() {
//    println(multiplyEB(20))

//    println(10/3)
//    println(10/3f)
//
//    hasChildAccess(heigh = 110, weight = 50, age = 20)
//    val any = functionReturnAny()
//    println(any)
//
//    functionWithAnyaram("string")
//    functionWithAnyaram('v')
//    functionWithAnyaram(3)

//    println(getDeveloperPosition(6))

    val a = 100
    val b = 200
    if (a>100){
        print("1")
    }else if (b<200){
        print("2")
    }else if (a>10){
        print("3")
    }else if (b>10){
        print("4")
    }
    print(calc(1>0))

//    val exp = 2
//    val posit = when(exp){
//        0 -> "Intern"
//        in 1..2 -> "jun"
//        3,4 -> "Middle"
//    }
}

fun calc(par: Boolean): Int{
    return if (par){
        val inter = 1 + 2
        inter +2
        inter +5
    }else{
        val inter = 2 + 4
        inter + 100
    }
}

//fun multiply(a: Int, b: Int):Int{
//    return a * b
//}

//fun multiplyEB(a:Int, b: Int) = a * b
//
//fun hasChildAccess(heigh: Int, weight:Int, age:Int):Boolean{
//    return heigh > 150 && weight > 30 && age > 10
//}
//
//fun functionReturnAny(): Any{
//    return  if (Random.nextBoolean()){
//        234234
//    } else {
//        "jdsbjhv"
//    }
//}
//
//fun functionWithAnyaram(param: Any){
//
//}
//
//fun maxInt(a:Int, b:Int):Int{
//    val maxValue: Int
//    if (a<b){
//        maxValue = b
//    }else {
//        maxValue = b
//    }
//    return maxValue
//}
//
//fun getCarType(maxSpeed: Int): String{
//    return when {
//        maxSpeed < 20 -> {
//            "Трактор"
//        }
//        maxSpeed <60 -> {
//            "Медленная машина"
//        }
//        maxSpeed <200 -> {
//            "Обычная машина"
//        }
//        else -> {
//            "Быстрая машина"
//        }
//    }
//}

fun getDeveloperPosition(experience: Int):String{
    return if(experience < 0){
        "Incorrect experience"
    }else {
        when(experience){
            0 -> "Intern"
            in 1..2 -> "Junior"
            in 3..4 -> "Middle"
            else -> "Senior"
        }
    }
}