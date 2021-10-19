package com.example.food_picker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {



    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val decideButton = findViewById<Button>(R.id.decideBTN)
        val addButton = findViewById<Button>(R.id.addItemBTN)
        val textReturn = findViewById<TextView>(R.id.restaurantText)
        val textInput = findViewById<EditText>(R.id.addFoodText)
        textReturn.text = "Decider"

        val restaurantList = arrayListOf("Burger King", "Mcdonald's", "YO Sushi", "SubWay"
        , "Five Guys", "Nando's", "Greggs", "Domino's Pizza", "Pizza Hut", "KFC", "Costa Coffee"
        , "PizzaExpress", "Papa John's")

        decideButton.setOnClickListener{
            val randomFood = Random.nextInt(restaurantList.count())
            textReturn.text = restaurantList[randomFood]
        }

        addButton.setOnClickListener{
            val newFood = textInput.text.toString()
            restaurantList.add(newFood)
            textInput.text.clear()
        }

    }
}