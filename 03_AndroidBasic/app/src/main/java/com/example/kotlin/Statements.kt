package com.example.kotlin

import kotlin.random.Random

fun main() {
    calculateRandomInt()
        .takeIf { it > 4 }
        ?.let { print("number is grater than 4") }
}

fun calculateRandomInt():Int = Random.nextInt()