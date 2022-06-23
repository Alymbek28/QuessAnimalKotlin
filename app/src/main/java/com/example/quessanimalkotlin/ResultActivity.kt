package com.example.quessanimalkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.quessanimalkotlin.databinding.ActivityMainBinding
import com.example.quessanimalkotlin.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val result = intent.getStringExtra("Key")
        binding.resultTv.text = result
    }
}