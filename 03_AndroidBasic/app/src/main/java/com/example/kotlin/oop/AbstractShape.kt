package com.example.kotlin.oop

abstract class AbstractShape(
    private var x: Int,
    private var y: Int
) {

    abstract val name: String

    abstract fun calculateArea():Double

    fun moveToPosition(x: Int, y: Int){
        this.x = x
        this.y = y
    }

    fun printPosition(){
        println("Shape with position (x = $x, y = $y)")
    }
}