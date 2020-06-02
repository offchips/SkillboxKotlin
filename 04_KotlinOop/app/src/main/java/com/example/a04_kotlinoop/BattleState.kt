package com.example.a04_kotlinoop

sealed class BattleState(private val state: String) {
    data class CurrentState(val state: String) : BattleState(state)
    data class FirstTeamWin(val state: String) : BattleState(state)
    data class SecondTeamWin(val state: String) : BattleState(state)
    data class NoOneWon(val state: String) : BattleState(state)

    fun printState(){
        println(state)
    }
}