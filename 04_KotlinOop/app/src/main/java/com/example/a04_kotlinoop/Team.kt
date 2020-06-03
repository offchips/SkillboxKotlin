package com.example.a04_kotlinoop

import com.example.a04_kotlinoop.warriors.Archer
import com.example.a04_kotlinoop.warriors.Infantryman
import com.example.a04_kotlinoop.warriors.Shooter
import com.example.a04_kotlinoop.warriors.Warrior
import com.example.a04_kotlinoop.weapons.Weapons.firearm
import com.example.a04_kotlinoop.weapons.Weapons.meleeWeapon
import com.example.a04_kotlinoop.weapons.Weapons.projectile
import com.example.a04_kotlinoop.weapons.Weapons.spears
import kotlin.random.Random

class Team(
    private val countOfWarrior: Int
) {
    private val listOfWarrior = mutableListOf<Warrior>()

    init {
        makeTeam(countOfWarrior)
    }

    private fun makeTeam(countOfWarrior: Int) {
        while (listOfWarrior.size < countOfWarrior) {
            when (Random.nextInt(100)) {
                in 1..20 -> listOfWarrior.add(
                    Shooter(
                        300,
                        30,
                        20,
                        weapon = firearm
                    )
                )
                in 21..40 -> listOfWarrior.add(
                    Shooter(
                        300,
                        30,
                        20,
                        weapon = projectile
                    )
                )
                in 41..60 -> listOfWarrior.add(
                    Infantryman(
                        200,
                        20,
                        25,
                        weapon = projectile
                    )
                )
                in 61..80 -> listOfWarrior.add(
                    Infantryman(
                        200,
                        20,
                        20,
                        weapon = meleeWeapon
                    )
                )
                in 81..100 -> listOfWarrior.add(
                    Archer(
                        200,
                        20,
                        10,
                        weapon = spears
                    )
                )
            }
        }
    }

    fun getWarriorList(): MutableList<Warrior> {
        return listOfWarrior
    }

    fun shuffle(){
        listOfWarrior.shuffle()
    }
}