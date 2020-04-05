package com.example.kotlin

fun main() {
    val pair1 = Pair("key","value")
    val pair2 = 1 to 2

    println("first = ${pair1.first}, second = ${pair1.second}")
    println(pair2)

    val map = mapOf(
        "Name1" to "+79991111111",
        "Name1" to "+79981111111",
        "Name2" to "+79991111112",
        "Name3" to "+79991111113"
    )

    println(map["Name1"])
    println(map["Name4"])

    val map2 = mapOf(   //так не рекомендуется
        1 to "string",
        "str" to 1
    )

    val mutableMap = map.toMutableMap()
    val mutableMap2 = mutableMapOf("1" to "2")
    mutableMap["Name1"] = "123123321"
    mutableMap["Name"] = "123123321"
    mutableMap.put("key", "value")
    mutableMap.remove("key")

    mutableMap.toMap()      //запрет изменять МАР

    val sortedMap = sortedMapOf(        //TreeMap
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "1" to "11"
    )

    val hashMap = hashMapOf(
        "2" to "22",
        "3" to "33",
        "4" to "44",
        "1" to "11"
    )

    println(sortedMap)

    println(hashMap.keys)
    println(hashMap.values)

    for (key in hashMap.keys){
        println("key = $key, value = ${hashMap[key]}")
    }

    hashMap.forEach{entry -> entry.key
        entry.value}
    //аналогично:
    hashMap.forEach{(key, value) ->
        key
        value}

}