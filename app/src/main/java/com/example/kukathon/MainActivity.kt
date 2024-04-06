package com.example.kukathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kukathon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (R.style.Theme_Kukathon)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}