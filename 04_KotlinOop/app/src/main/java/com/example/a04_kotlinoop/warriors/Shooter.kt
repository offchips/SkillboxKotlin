package com.example.a04_kotlinoop.warriors

import com.example.a04_kotlinoop.weapons.AbstractWeapon

//стрелок
class Shooter(
    maxHealth: Int,
    chanceToDodging: Int,
    accuracy: Int,
    weapon: AbstractWeapon
): AbstractWarrior(maxHealth, chanceToDodging, accuracy, weapon) {
}