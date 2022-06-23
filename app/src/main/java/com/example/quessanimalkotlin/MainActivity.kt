package com.example.quessanimalkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quessanimalkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var isCat: Boolean = false
    var isDog: Boolean = true
    var isHorse: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            catBtn.setOnClickListener{
                animalImg.setImageResource(R.drawable.cat)
                isDog = false
                isHorse = false
                isCat = true
            }
            dogBtn.setOnClickListener{
                animalImg.setImageResource(R.drawable.dog)
                isDog = true
                isHorse = false
                isCat = false
            }
            horseBtn.setOnClickListener{
                animalImg.setImageResource(R.drawable.horse)
                isDog = false
                isHorse = true
                isCat = false
            }

            thatCatBtn.setOnClickListener{
                if (isCat) {
                    Toast.makeText(applicationContext, "Правда", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Не правильно", Toast.LENGTH_SHORT).show()
                }
            }

            thatDogBtn.setOnClickListener{
                if (isDog) {
                    Toast.makeText(applicationContext, "Правда", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Не правильно", Toast.LENGTH_SHORT).show()
                }
            }

            thatHorseBtn.setOnClickListener{
                if (isHorse) {
                    Toast.makeText(applicationContext, "Правда", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Не правильно", Toast.LENGTH_SHORT).show()
                }
            }
            sendBtn.setOnClickListener{
                val intent = Intent(this@MainActivity, ResultActivity::class.java)
                intent.putExtra("isCat", "Кот")
                intent.putExtra("isDog", "Кот1")
                intent.putExtra("isHorse", "Кот2")
                startActivity(intent)
            }
        }
    }
}

