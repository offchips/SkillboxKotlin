package com.example.kotlin.oop

class Airplane(maxSpeed:Int): Vehicle(maxSpeed) {
    override fun getTitle(): String = "Airplane"
}