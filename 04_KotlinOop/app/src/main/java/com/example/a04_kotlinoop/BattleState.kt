package com.example.a04_kotlinoop

sealed class BattleState(private val state: String) {

    class CurrentState(firstTeamHealth: Int, secondTeamHealth: Int) :
        BattleState("Progress(commandAHealth=$firstTeamHealth, commandBHealth=$secondTeamHealth)")
    object FirstTeamWin : BattleState("Победила первая команда")
    object SecondTeamWin : BattleState("Победила вторая команда")
    object NoOneWon : BattleState("Ничья")

    fun printState(){
        println(state)
    }

}