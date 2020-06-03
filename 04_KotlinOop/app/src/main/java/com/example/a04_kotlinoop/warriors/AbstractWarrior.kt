package com.example.a04_kotlinoop.warriors

import com.example.a04_kotlinoop.weapons.AbstractWeapon
import kotlin.random.Random
import kotlin.random.nextInt

abstract class AbstractWarrior(
    maxHealth: Int,
    override val chanceToDodging: Int,
    private val accuracy: Int,
    private val weapon: AbstractWeapon
) : Warrior {
    private var currentHealth: Int
    override var isKilled: Boolean = false

    init {
        currentHealth = maxHealth
    }

    override fun attack(warrior: Warrior) {
        val outOfAmmo = weapon.ammoIsEmpty
        if (outOfAmmo) {
            weapon.reload()
        } else {
            if (Random.nextInt(0..accuracy) >= Random.nextInt(0..chanceToDodging)) {
                val damage = weapon.getWeapon().sumBy { it.getDamage() }
                warrior.takeDamage(damage)
            }
        }
    }

    override fun takeDamage(damage: Int) {
        if (currentHealth - damage < 0) {
            isKilled = true
            currentHealth = 0
        } else {
            currentHealth = currentHealth - damage
        }
    }

    override fun getCurrentHealth(): Int {
        return currentHealth
    }
}