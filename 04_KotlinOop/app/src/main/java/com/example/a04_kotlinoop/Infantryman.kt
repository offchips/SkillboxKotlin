package com.example.a04_kotlinoop

//пехотинец
class Infantryman(
    maxHealth: Int,
    chanceToDodging: Int,
    accuracy: Int,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHealth, chanceToDodging, accuracy, weapon) {
}