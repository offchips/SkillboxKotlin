package com.example.a04_kotlinoop

import kotlin.random.Random

enum class Ammo(
    private val damage: Int,                                                                                    //урон
    private val chanceOfCriticalDamage: Int,                                                                    //шанс критического урона
    private val coefficientOfCriticalDamage: Int                                                                //коэф. критического урона
) {
    BULLET(30, 50, 25),                       //пуля
    GRENADE(50, 40, 20),                      //граната
    KNIFE(15, 40, 25),                        //нож
    ARROW(10, 30, 15);                        //стрела

//    private var currentDamage: Int =
//        0                                                               //текущий урон

//    init {
//    }

    fun getDamage(): Int {                                                                          //получение текущего урона
        val chance =
            Random.nextInt(60) > chanceOfCriticalDamage                                       //шанс на критический урон (булево)
        val criticalDamage: Int                                                                     //критический урон
        if (chance) {
            criticalDamage = 0
        } else {
            criticalDamage = (0..coefficientOfCriticalDamage).shuffled().last()
        }
        var currentDamage =
            criticalDamage + damage                                                                 //тек урон = крит(по шансу) + урон(по умолчанию)

        return currentDamage
    }
}