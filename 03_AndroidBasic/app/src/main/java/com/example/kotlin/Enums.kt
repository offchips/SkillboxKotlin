package com.example.kotlin

fun main() {
    val color = Color.BLACK.hex
    Color.RED.draw()

    Color.values().forEach {
//        it.draw()
//        println(it.name)
        println(it.ordinal)
    }

//    Color.valueOf("") //нужно указывать правильное имя

//    Color.values()[Color.RED.ordinal]

    Color.fromName("651651") // если не найдет то вернет null

    SealedColor.Black
    SealedColor.CustomColor("#ff0")
}

fun invertColor(color: SealedColor):SealedColor //Color если к Color
    {
    return when(color){
//        Color.WHITE -> Color.BLACK
//        Color.BLACK -> Color.WHITE
//        Color.RED -> Color.BLUE
//        Color.BLUE -> Color.RED
//        Color.GREEN -> Color.RED
        SealedColor.Black -> SealedColor.White
        SealedColor.White -> SealedColor.Black
        is SealedColor.CustomColor -> {
            SealedColor.White
        }
    }
}