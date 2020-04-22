package com.example.a04_kotlinoop

import kotlin.random.Random
import kotlin.random.nextInt

abstract class AbstractWarrior(
    maxHealth: Int,
    override val chanceToDodging: Int,
    val accuracy: Int,
    private val weapon: AbstractWeapon
) : Warrior {
    private var currentHealth: Int
    override var isKilled: Boolean = false

    init {
        currentHealth = maxHealth
    }

    override fun attack(warrior: Warrior) {
        val outOfAmmo = weapon.getWeapon().isEmpty()
        var damage: Int = 0
        if (outOfAmmo) {
            weapon.reload()
        } else {
            if (Random.nextInt(0..accuracy) >= Random.nextInt(0..chanceToDodging)) {
                damage = weapon.getWeapon().sumBy { it.getDamage() }
                warrior.takeDamage(damage)
            }
        }
    }

    override fun takeDamage(damage: Int) {
        if (currentHealth - damage > 0) {
            currentHealth = 0
        } else {
            currentHealth = currentHealth - damage
        }
        isKilled = currentHealth.equals(0)
    }
}