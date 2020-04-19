package com.example.kotlin

import com.example.kotlin.oop.Shape

class Circle(
    radius:Int
):Shape {
    override val name: String = "Circle"
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
    var radius:Int by PrintAreaOnChangeDelegate(radius)
}