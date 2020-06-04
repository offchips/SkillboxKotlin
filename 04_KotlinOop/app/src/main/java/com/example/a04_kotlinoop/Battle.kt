package com.example.a04_kotlinoop

import com.example.a04_kotlinoop.warriors.Warrior
import kotlin.random.Random

class Battle(
    private val countOfWarrior: Int
) {
    var battleEnd: Boolean = false
    var teamsArray = Array(2){Team(countOfWarrior)}
    var turnFirst:Int = Random.nextInt(2)

    fun makeIteration(){
        if (turnFirst == 1){
            teamsArray.reverse()
        }
        println("Начало битвы")
        while (!battleEnd){
            when (val battleState = getBattleState()){
                is BattleState.CurrentState -> {
                    shuffled()
                    battleState.printState()
                }
                is BattleState.FirstTeamWin -> {
                    battleEnd = true
                    battleState.printState()
                }
                is BattleState.SecondTeamWin -> {
                    battleEnd = true
                    battleState.printState()
                }
                is BattleState.NoOneWon -> {
                    battleEnd = true
                    battleState.printState()
                }
            }
        }
    }

     fun getBattleState(): BattleState {
        val firstTeamHealth = teamsArray[0].getWarriorList().sumBy { it.getCurrentHealth() }
        val secondTeamHealth = teamsArray[1].getWarriorList().sumBy { it.getCurrentHealth() }
        return if (firstTeamHealth == 0 && secondTeamHealth != 0){
            BattleState.SecondTeamWin
        }else if (secondTeamHealth == 0 && firstTeamHealth != 0){
            BattleState.FirstTeamWin
        }else if (firstTeamHealth != 0 && secondTeamHealth != 0){
            BattleState.CurrentState(firstTeamHealth,secondTeamHealth)
        }else {
            BattleState.NoOneWon
        }
    }

    private fun shuffled(){
        teamsArray.forEach { it.shuffle() }
        teamsArray.forEach { team ->
            team.getWarriorList().forEach { warrior ->
                if (!warrior.isKilled) {
                    val targetWarrior: Warrior = if (team == teamsArray[0]) {
                        teamsArray[1].getWarriorList().filter { !warrior.isKilled }.random()
                    } else {
                        teamsArray[0].getWarriorList().filter { !warrior.isKilled }.random()
                    }
                    warrior.attack(targetWarrior)
                }
            }
        }
    }
}