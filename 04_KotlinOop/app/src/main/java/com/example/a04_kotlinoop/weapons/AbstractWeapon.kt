package com.example.a04_kotlinoop.weapons

abstract class AbstractWeapon(
    val maxWeapon: Int,                                                                             //количество патронов в обойме
    val fireType: FireType                                                                          //тип стрельбы
) {
    private var ammoList: MutableList<Ammo> = mutableListOf()                                       //патроны в обойме
    var weapons: MutableList<Ammo> = mutableListOf()
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
    }

    fun getWeapon(): List<Ammo> {                                                                   //получение патрона
        var countRepeat = fireType.repeatCount                                                 //если обойма не пуста и количество перезарядок больше 0
        while (!ammoIsEmpty && countRepeat > 0) {
            weapons.add(ammoList.last())                                                            //добавляем использованый патрон
            ammoList.removeAt(ammoList.lastIndex)                                                   //удаляем его из списка патронов
            countRepeat--                                                                           //уменьшаем количество перезарядок
        }
        return weapons                                                                              //возврат патронов для использования
    }
}