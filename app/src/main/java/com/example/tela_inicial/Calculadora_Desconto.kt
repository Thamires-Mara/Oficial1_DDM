package com.example.tela_inicial

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculadora__desconto.*

class Calculadora_Desconto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora__desconto)

        btn_calcu.setOnClickListener {
            val pag = valorcompra.text.toString().toDouble()
            val desc = desconto.text.toString().toInt()


        }
    }
}