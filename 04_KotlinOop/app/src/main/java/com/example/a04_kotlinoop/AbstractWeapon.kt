package com.example.a04_kotlinoop

abstract class AbstractWeapon(
    val maxWeapon: Int,                                                                             //количество патронов в обойме
    val fireType: FireType                                                                          //тип стрельбы
) {
    private var ammoList: MutableList<Ammo> =
        mutableListOf()                                                                             //патроны в обойме

    val ammoIsEmpty: Boolean                                                                        //признак пустоты обоймы
        get() = ammoList.isEmpty()

    abstract fun makeWeapon(): Ammo                                                                 //создание патрона (абстрактный)

    fun reload() {                                                                                  //перезарядка
        if (ammoList.size > 0) {
            for (ever in ammoList.size..maxWeapon) {
                ammoList.add(makeWeapon())
            }
        } else {
            for (ever in 1..maxWeapon) {
                ammoList.add(makeWeapon())
            }

        }
//        ammoList.clear()                                                                            //очистка обоймы
    }

    fun getWeapon(): List<Ammo> {                                                                   //получение патрона
        var weapons: MutableList<Ammo> =
            mutableListOf()                                                                         //использованные патроны
        var countRepeat =
            fireType.repeatCount                                                                    //если обойма не пуста и количество перезарядок больше 0
        while (!ammoIsEmpty && countRepeat > 0) {
            weapons.add(ammoList.last())                                                            //добавляем использованый патрон
            ammoList.removeAt(ammoList.lastIndex)                                                   //удаляем его из списка патронов
            countRepeat--                                                                           //уменьшаем количество перезарядок
        }
        return weapons                                                                              //возврат патронов для использования
    }
}