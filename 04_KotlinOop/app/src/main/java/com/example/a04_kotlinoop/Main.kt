package com.example.a04_kotlinoop

fun main() {
    while (true) {
        print("Введите количество воинов: ")
        val teamCount = readLine()?.toIntOrNull() ?: continue
        val battle = Battle(teamCount)
        battle.makeIteration()
    }
}