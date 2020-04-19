package com.example.kotlin

import com.example.kotlin.oop.Car

fun main() {
    val tesla = Car(
        wheelCount = 4, doorCount = 2, bodyLength = 500, bodyWidth = 200, bodyHeigth = 150
    )

    println("tesla wheelCount = ${tesla.wheelCount}, doorCount = ${tesla.doorCount}, currentSpeed = ${tesla.currentSpeed}")
//    tesla.currentSpeed = 234
//    println("tesla currentSpeed = ${tesla.currentSpeed}")

    tesla.accelerate(100)
    println("tesla currentSpeed = ${tesla.currentSpeed}")
    tesla.deccelerate(50)
    println("tesla currentSpeed = ${tesla.currentSpeed}")
    println("tesla fuelCount = ${tesla.fuelCount}")

//    val nissan = Car(4,2,Triple(500,200,150))

}
