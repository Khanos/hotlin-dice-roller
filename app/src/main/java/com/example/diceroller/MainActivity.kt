package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            // val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            // toast.show()
            val resultTextView: TextView = findViewById(R.id.textView)
            val resultTextView2: TextView = findViewById(R.id.textView2)
            resultTextView.text = rollDice().toString()
            resultTextView2.text = rollDice().toString()
        }
    }

    private fun rollDice(): Int {
        val dice = Dice(6)
        return dice.roll()
    }

    /*
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
    */
}

class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}