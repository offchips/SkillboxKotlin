package com.example.kotlin

import com.example.kotlin.oop.Car
import com.example.kotlin.oop.CarVehicle
import com.example.kotlin.oop.Vehicle

fun main() {
    val car1 = CarVehicle(4,4,200)
    val car2 = CarVehicle(4,4,200)
    val car3 = car1

    println("car1 equals to car2 by reference = ${car1 === car2}")
    println("car1 equals to car3 by reference = ${car1 === car3}")
    println("car1 equals to car2 by value = ${car1 == car2}")

    val cars = listOf(
        car1,
        CarVehicle(2,2,100),
        CarVehicle(2,3,100)
    )
    println(cars.contains(CarVehicle(2,2,100)))

    val map = hashMapOf(
        car1 to "1",
        car2 to "2",
        CarVehicle(2,2,100) to "3"
    )

    println(map[CarVehicle(4,4,200)])
}