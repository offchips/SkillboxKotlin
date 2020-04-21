package com.example.a04_kotlinoop

abstract class AbstractWarrior(
    maxHealth: Int,
    override val chanceToDodging: Int,
    val accuracy: Int,
    val weapon: AbstractWeapon
) : Warrior {
    var currentHealth: Int

    init {
        currentHealth = maxHealth
    }

    override fun attack(warrior: Warrior) {
        val outOfAmmo = weapon.getWeapon().isEmpty()
        if (outOfAmmo) {
            weapon.reload()
        } else {
            val damage: Int
            damage = weapon.getWeapon().sumBy { it.getDamage() }
            warrior.takeDamage(damage)
        }
    }

    override fun takeDamage(damage: Int) {
        if (currentHealth - damage > 0) {
            currentHealth = 0
        } else {
            currentHealth = currentHealth - damage
        }
    }
}