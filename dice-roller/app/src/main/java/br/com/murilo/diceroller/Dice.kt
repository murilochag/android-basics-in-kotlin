package br.com.murilo.diceroller

class Dice(val numSide: Int = 6) {



    fun roll():Int{
        return (1..numSide).random()
    }


}