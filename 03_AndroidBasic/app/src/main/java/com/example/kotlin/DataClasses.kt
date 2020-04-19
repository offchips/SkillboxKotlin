package com.example.kotlin

import com.example.kotlin.oop.CarVehicle

fun main() {
    val user1 = User("name1", "lastname1")
    user1.inerState = "state1"
    val user2 = User("name1", "lastname1")
    user2.inerState = "state2"

    println(user1 == user2)

    val user3 = user1.copy(lastName = "copiedLastName")
    println("user3 innerState = ${user3.inerState}")
    println(user1)

    val (name, lastname) = User("name5", "lastname5")
    println("name = ${name}, lastname = ${lastname}")
    // аналогично:
    val user5 = User("name5", "lastname5")
    val name5 = user5.component1()
    val lastname5 = user5.component2()
    println("name = ${name5}, lastname = ${lastname5}")

    val users = listOf(
        user1,
        user2,
        user3
    )
    users.forEach{(name, lastname) -> println("$name $lastname")}

    val (wheelCount, doorCount) = CarVehicle(4,2,200)
    wheelCount

    val map = mapOf(
        1 to "1",
        2 to "2"
    )
    for ((key, value) in map) {
        key
        value
    }
}
