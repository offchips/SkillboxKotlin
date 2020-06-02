package com.example.a04_kotlinoop.warriors

import com.example.a04_kotlinoop.weapons.AbstractWeapon

//пехотинец
class Infantryman(
    override var isKilled: Boolean,
    maxHealth: Int,
    chanceToDodging: Int,
    accuracy: Int,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHealth, chanceToDodging, accuracy, weapon) {
}