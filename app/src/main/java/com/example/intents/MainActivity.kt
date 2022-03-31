package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonIrPantallaB.setOnClickListener {

            val nombre = binding.editTextNombre.text.toString()

            val intent = Intent(this, Perfil::class.java)
            intent.putExtra("nombre",nombre)
            this.startActivity(intent)
        }

        binding.buttonBuscar.setOnClickListener {

            val Search = "https://www.google.com/search?q=" + binding.editTextSearch.text.toString()
            val queryUrl: Uri = Uri.parse(Search)

            val intent = Intent(Intent.ACTION_VIEW,queryUrl)
            this.startActivity(intent)
        }



    }
}