package com.example.bitesandtales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bitesandtales.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFoodDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = intent.getStringExtra("MenuItemName")
        val foodImage = intent.getIntExtra("MenuItemImage", 0)

        binding.foodNameDetailsTV.text = foodName
        binding.foodDetailsIV.setImageResource(foodImage)
        binding.backButtonFoodDetails.setOnClickListener {
            finish()
        }
    }
}