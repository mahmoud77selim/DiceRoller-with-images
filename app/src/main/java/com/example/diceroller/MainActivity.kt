
package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)// Find the Button in the layout
        rollButton.setOnClickListener {
            rollDice()
            rollDice2() } }

    /**
     * Roll the dice and update the screen with the result.
     */

    private fun rollDice() {
        val dice = Dice(6)// Create new Dice object with 6 sides and roll it
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)// Find the ImageView in the layout

        val drawableResource = when (diceRoll) {// Determine which drawable resource ID to use based on the dice roll
            1 -> R.drawable.dice_1 2 -> R.drawable.dice_2 3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4 5 -> R.drawable.dice_5 else-> R.drawable.dice_6 }
        diceImage.setImageResource(drawableResource) // Update the ImageView with the correct drawable resource ID
        diceImage.contentDescription = diceRoll.toString()}// Update the content description


    private fun rollDice2() {
        val dice2 = Dice2(6)// Create new Dice object with 6 sides and roll it
        val diceRoll2 = dice2.roll2()
        val diceImage2: ImageView = findViewById(R.id.imageView2)// Find the ImageView in the layout
        val drawableResource2 = when (diceRoll2) {// Determine which drawable resource ID to use based on the dice roll
            1 -> R.drawable.dice_1 2 -> R.drawable.dice_2 3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4 5 -> R.drawable.dice_5 else -> R.drawable.dice_6 }

        diceImage2.setImageResource(drawableResource2)// Update the ImageView with the correct drawable resource ID
        diceImage2.contentDescription = diceRoll2.toString()} }  // Update the content description


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    } }

class Dice2(private val numSides2: Int) {
    fun roll2(): Int {
        return (1..numSides2).random()
    } }