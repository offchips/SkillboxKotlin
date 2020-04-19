package com.example.kotlin.oop

import com.example.kotlin.PrintAreaOnChangeDelegate
import kotlin.reflect.KProperty

class Rectangle(
    x: Int,
    y: Int,
    width: Int,
    height: Int
) : Shape, Comparable<Rectangle> {

    var width:Int by PrintAreaOnChangeDelegate<Int>(value = width)
    var height:Int by PrintAreaOnChangeDelegate(height)


    override val name: String = "Rectangle"

    override fun calculateArea(): Double = width * height.toDouble()

    override fun compareTo(other: Rectangle): Int {
        return (width + height) - (other.width + other.height)
    }

    override fun toString(): String {
        return "Rectangle (width = $width, height = $height)"
    }

    operator fun plus(other: Rectangle):Rectangle {
        return Rectangle(0,0,width+other.width, height+other.height)
    }

    operator fun unaryMinus():Rectangle{
        return Rectangle(0,0,-width, -height)
    }
}








