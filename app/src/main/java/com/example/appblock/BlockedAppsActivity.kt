package com.example.appblock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.appblock.databinding.ActivityMainBinding

class BlockedAppsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}