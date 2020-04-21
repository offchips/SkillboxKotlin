package com.example.a04_kotlinoop

object Weapons {
    val firearm =
        object : AbstractWeapon(                                          //огнестрельное оружие
            maxWeapon = 100,
            fireType = FireType.BurstsShots(ammo = Ammo.BULLET, repeatCount = 10)
        ) {
            override fun makeWeapon(): Ammo {
                return fireType.ammo
            }
        }
    val meleeWeapon =
        object : AbstractWeapon(                                      //холодное оружие
            maxWeapon = 10,
            fireType = FireType.SingleShots(Ammo.KNIFE)
        ) {
            override fun makeWeapon(): Ammo {
                return fireType.ammo
            }
        }
    val spears = object : AbstractWeapon(                                           //копья и стрелы
        maxWeapon = 1,
        fireType = FireType.SingleShots(Ammo.ARROW)
    ) {
        override fun makeWeapon(): Ammo {
            return fireType.ammo
        }
    }
    val projectile = object : AbstractWeapon(                                       //гранаты
        maxWeapon = 5,
        fireType = FireType.SingleShots(Ammo.GRENADE)
    ) {
        override fun makeWeapon(): Ammo {
            return fireType.ammo
        }
    }

}