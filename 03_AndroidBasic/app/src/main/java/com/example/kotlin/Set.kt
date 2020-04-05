package com.example.kotlin

fun main() {
    val immutableSet = setOf(1,2,3,3,2,1,4,5,6,7,7,7,7,7,7)
    println(immutableSet.size)

    val unionSet = setOf(1,2,3).union(setOf(1,4,5))
    println(unionSet)

    val substractSet = setOf(1,2,3).subtract(setOf(1,2,4))
    println(substractSet)

    val intersectSet = setOf(1,2,4).intersect(setOf(4,5,5))
    println(intersectSet)

    val naturalOrderSet = sortedSetOf(1,4,-1,2,5,2)
    println(naturalOrderSet)
    println(naturalOrderSet.descendingSet())

    mutableSetOf(1,2,3).add(34) //изменяемый сет

    val hashSet = hashSetOf(1,2,3)
    hashSet.add(1)
    hashSet.remove(1)

    hashSet.contains(1)  //булево (содержится ли элемент в сете)
    1 in hashSet // аналогично
    println(1 in hashSet)
}