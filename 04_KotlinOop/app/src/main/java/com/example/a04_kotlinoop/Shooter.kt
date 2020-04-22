package com.example.a04_kotlinoop

//стрелок
class Shooter(
    maxHealth: Int,
    chanceToDodging: Int,
    accuracy: Int,
    weapon: AbstractWeapon
): AbstractWarrior(maxHealth, chanceToDodging, accuracy, weapon) {
}