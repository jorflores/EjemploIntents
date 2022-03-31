package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityPantalla3Binding
import com.example.intents.databinding.ActivityPerfilBinding

class Pantalla3 : AppCompatActivity() {

    private lateinit var binding: ActivityPantalla3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPantalla3Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}