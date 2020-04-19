package com.example.kotlin

sealed class SealedColor(
    val hex:String
): Drawable {
    object White: SealedColor("#fff")
    object Black: SealedColor("#fff"){
        override fun draw() {
            println("draw black")
        }
    }

    class CustomColor(hex: String):SealedColor(hex)

    override fun draw(){
        println("draw sealed")
    }
}