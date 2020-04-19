package com.example.kotlin.oop

import com.example.kotlin.Engine
import com.example.kotlin.User
import java.sql.Driver

class CarVehicle(
    val wheelCount: Int,
    val doorCount: Int,
    maxSpeed: Int
) : Vehicle(maxSpeed) {
    var isDoorOpen: Boolean = false
        private set

    private lateinit var driver: User

    private val engine by lazy {
        Engine()
    }

    //разложение на свойства
    operator fun component1(): Int = wheelCount
    operator fun component2(): Int = doorCount

    fun openDoor() {
        if (!isDoorOpen) {
            println("door is open")
        }
        isDoorOpen = true
    }

    fun closeDoor() {
        if (isDoorOpen) {
            println("door is close")
            if (::driver.isInitialized) {
                println("driver = $driver")
            }
        }
        isDoorOpen = false
    }

    override fun accelerate(speed: Int) {
        engine.use()
        if (isDoorOpen) {
            println("you can`t accelerate with open door")
        } else {
            super.accelerate(speed)
        }
    }

    fun setDriver(driver: User) {
        this.driver = driver
    }

    override fun getTitle(): String = "Car"

    fun accelerate(speed: Int, force: Boolean) {
        if (force) {
            if (isDoorOpen) println("warning! accelerate with opened door")
            super.accelerate(speed)
        } else {
            accelerate(speed)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CarVehicle

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (isDoorOpen != other.isDoorOpen) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + isDoorOpen.hashCode()
        return result
    }

    companion object {
        val default = CarVehicle(4, 4, 200)
        fun createWithDefaultWheelCount(doorCount: Int, maxSpeed: Int): CarVehicle {
            return CarVehicle(4, doorCount, maxSpeed)
        }
    }

}

//class CarVehicle:Vehicle{
//    constructor(){
//
//    }
//}