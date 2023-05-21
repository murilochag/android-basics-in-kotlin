package br.com.murilo.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll_button: Button = findViewById(R.id.roll_botton)

        roll_button.setOnClickListener{rollDice()}


    }

    fun rollDice(){
        val imgView_dice: ImageView = findViewById(R.id.img_view)
        val dice = Dice(6)

        val diceRoll: Int = dice.roll()

        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imgView_dice.setImageResource(drawableResource)

        imgView_dice.contentDescription = diceRoll.toString()
    }
}