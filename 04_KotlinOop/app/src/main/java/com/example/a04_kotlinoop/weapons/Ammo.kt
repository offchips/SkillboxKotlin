package com.example.a04_kotlinoop.weapons

import kotlin.random.Random

enum class Ammo(
    private val damage: Int,                                                                                    //урон
    private val chanceOfCriticalDamage: Int,                                                                    //шанс критического урона
    private val coefficientOfCriticalDamage: Int                                                                //коэф. критического урона
) {
    BULLET(2, 20, 15),                       //пуля
    GRENADE(5, 30, 30),                      //граната
    KNIFE(5, 20, 30),                        //нож
    ARROW(3, 10, 10);                        //стрела

    fun getDamage(): Int {                                                                          //получение текущего урона
        val chance =
            Random.nextInt(60) > chanceOfCriticalDamage                                       //шанс на критический урон (булево)
        val criticalDamage: Int                                                                     //критический урон
        if (chance) {
            criticalDamage = 0
        } else {
            criticalDamage = (0..coefficientOfCriticalDamage).shuffled().last()
        }

        return criticalDamage + damage
    }
}