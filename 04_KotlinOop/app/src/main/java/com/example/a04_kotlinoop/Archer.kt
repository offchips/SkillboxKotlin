package com.example.a04_kotlinoop

//лучник
class Archer(
    maxHealth: Int,
    chanceToDodging: Int,
    accuracy: Int,
    weapon: AbstractWeapon
) : AbstractWarrior(maxHealth, chanceToDodging, accuracy, weapon) {
}