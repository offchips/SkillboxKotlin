package com.example.a04_kotlinoop.weapons

sealed class FireType(
    open val ammo: Ammo,                                                                            //тип оружия
    open val repeatCount: Int                                                                       //количество перезарядок
) {
    data class SingleShots(                                                                         //одиночный выстрел
        override val ammo: Ammo,
        override val repeatCount: Int = 1
    ) : FireType(ammo, repeatCount)

    data class BurstsShots(                                                                         //выстрел очередью
        override val ammo: Ammo,
        override val repeatCount: Int
    ) : FireType(ammo, repeatCount)
}