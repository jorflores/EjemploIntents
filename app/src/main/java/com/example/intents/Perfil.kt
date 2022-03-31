package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMainBinding
import com.example.intents.databinding.ActivityPerfilBinding

class Perfil : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val nombre = intent.extras?.getString("nombre")

        binding.textViewPerfil.text = nombre

    }
}