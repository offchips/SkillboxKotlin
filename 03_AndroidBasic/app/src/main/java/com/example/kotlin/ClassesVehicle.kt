package com.example.kotlin

import com.example.kotlin.oop.*

fun main() {
////    val tesla = CarVehicle(4,2, maxSpeed = 150)
////    tesla.accelerate(100)
////    tesla.refuel(10)
////    tesla.isDoorOpen
////    tesla.closeDoor()
//
//    val tesla = CarVehicle(4,2,150)
//
//    with(tesla){
//        refuel(100)
//        openDoor()
////        closeDoor()
//        accelerate(100)
//        accelerate(100,true)
//        deccelerate(50)
//    }
//
////    tesla.let {
////        it.refuel(100)
////        it.openDoor()
////    }
//
////    val vehicle = Vehicle(100)
////    vehicle.accelerate(100)
//
//    val vehicle: Vehicle = tesla
//    println("vehicle is car = ${vehicle is CarVehicle}")
//    println("car is vehicle = ${tesla is Vehicle}")
//    println("vehicle is car = ${Vehicle(100) is CarVehicle}")
//
//    val newCar: CarVehicle? = vehicle as? CarVehicle
//    newCar?.closeDoor()

//    val vehicle:Vehicle = CarVehicle(4,4,100)
//    vehicle.getTitle()

//    listOf<Vehicle>(
//        Vehicle(100),
//        CarVehicle(4,4,100),
//        Airplane(100)
//    ).forEach{
//        println(it.getTitle())
//    }

//    val shape = Rectangle(x = 1, y = 1, width = 2, height = 2)
////    shape.printPosition()
////    shape.moveToPosition(2,2)
////    shape.printPosition()
//
////    println("shape area = ${shape.calculateArea()}")
////    println("shape name = ${shape.name}")
////
//    val largeRectangle = Rectangle(1,1,20,30)
//
////    println("shape <= largeRectangle (${shape <= largeRectangle})")
//
//    val set: MutableSet<Rectangle> = sortedSetOf(
//        largeRectangle,
//        shape
//    )
//
//    println(set)

    val shape = object : Shape{

        val additionalField = 123

        fun additionalMethod() = 234

        override val name: String = "anonymous shape"

        override fun calculateArea(): Double = 0.0
    }

    shape.additionalField
    shape.additionalMethod()
}