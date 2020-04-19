package com.example.a04_kotlinoop

interface Warrior {
    val isKilled: Boolean
    val chanceToDodging: Int
    fun attack(warrior: Warrior)
    fun takeDamage(damage: Int)
}