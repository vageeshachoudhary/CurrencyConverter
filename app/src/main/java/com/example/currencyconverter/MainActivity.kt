package com.example.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.currencyconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun convertCurrency(view: View)
    {
        if(binding.dollarText.text.isNotEmpty())
        {
            val dollarValue = binding.dollarText.text.toString().toFloat()
            val euroValue = String.format("%.2f",(dollarValue * 0.85f))
            binding.euroValueTextView.text = euroValue.toString()
        }
        else
        {
            binding.euroValueTextView.text = "No Value"
        }
    }
}