package com.example.kotlin.oop

open class Vehicle(
    val maxSpeed: Int
) {

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
        protected set

    open fun getTitle():String{
        return "Vehicle"
    }

    open fun accelerate(speed: Int) {
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

    open protected fun useFuel(fuelCount: Int) {
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