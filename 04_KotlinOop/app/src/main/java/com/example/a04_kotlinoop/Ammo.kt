package com.example.a04_kotlinoop

import kotlin.random.Random

enum class Ammo(
    damage: Int,                                                                                    //урон
    chanceOfCriticalDamage:Int,                                                                     //шанс критического урона
    coefficientOfCriticalDamage: Int                                                                //коэф. критического урона
) {
    BULLET(30,50,25),                         //пуля
    GRENADE(50,40,20),                        //граната
    KNIFE(15,40,25),                          //нож
    ARROW(10,30,15);                          //стрела

    private var currentDamage:Int                                                                   //текущий урон

    init {
        val chance = Random.nextInt(100) > chanceOfCriticalDamage                             //шанс на критический урон (булево)
        val criticalDamage:Int                                                                      //критический урон
            if (chance) {
                criticalDamage = 0
            } else {
                criticalDamage = (0..coefficientOfCriticalDamage).shuffled().last()
            }
        currentDamage = criticalDamage + damage                                                     //тек урон = крит(по шансу) + урон(по умолчанию)
    }

    fun getDamage():Int {                                                                           //получение текущего урона
        return currentDamage
    }
}