package com.example.appejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cuadroEntrada : EditText = findViewById(R.id.editTextText)
        val miBoton : Button = findViewById(R.id.button4)
        val cuadroSalida : TextView = findViewById(R.id.textView2)

        miBoton.setOnClickListener{
            var textoIntro = cuadroEntrada.text.toString()
            cuadroSalida.text = textoIntro
        }

    }
}