package com.example.kotlin.oop

class Car(
    val wheelCount: Int,
    val doorCount: Int,
    val bodyLength: Int,
    val bodyWidth: Int,
    val bodyHeigth: Int
) {
    //    init {
//        println("Car init")
//    }
    var currentSpeed: Int = 0
        get() {
            println("currentSpeed get")
            return field
        }
        private set(value) {
            println("currentSpeed set $value")
            field = value
        }
    var fuelCount: Int = 0
        private set

//    constructor(wheelCount: Int, doorCount: Int, bodySize:Triple<Int,Int,Int>):this(wheelCount,doorCount,bodySize.first, bodySize.second, bodySize.third){
//        println("Car secondary constructor")
//    }

    fun accelerate(speed: Int) {
        val needFuel = speed / 2
        if (fuelCount >= needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        } else {
            println("Car has no fuel")
        }
    }

    fun deccelerate(speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
    }

    private fun useFuel(fuelCount: Int) {
        this.fuelCount -= fuelCount
    }

    fun refuel(fuelCount: Int) {
        if (currentSpeed == 0) {
            this.fuelCount += fuelCount
        } else {
            println("You can`t refuel with currentSpeed != 0")
        }

    }
}