package com.example.kotlin

import com.example.kotlin.oop.CarVehicle
import com.example.kotlin.oop.Vehicle

fun main() {

    Cars.nissan
    Cars.someMethod()
    Cars.accelerate(20)

    CarVehicle.default
    CarVehicle.createWithDefaultWheelCount(4,200)
    val a = CarVehicle
    val b = Cars
}

object Cars: Vehicle(100) {
    val toyota = CarVehicle(4,4,200)
    val nissan = CarVehicle(4,4,200)

    fun someMethod(){

    }
}