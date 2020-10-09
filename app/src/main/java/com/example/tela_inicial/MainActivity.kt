package com.example.tela_inicial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_calcbolso.setOnClickListener {
            opencalcbolso()
        }

        btn_calcconver.setOnClickListener {
            opencalcconver()
        }

        btn_calcdesc.setOnClickListener {

        }
        bnt_costum.setOnClickListener {
            opencostum()
        }


    }

    private fun opencostum() {
        val next = Intent(this, Customizacao::class.java)
        startActivity(next)
    }

    private fun opencalcbolso() {
        val next1 = Intent(this, Calculadora_de_Bolso::class.java)
        startActivity(next1)
    }

    private fun opencalcconver() {
        val next2 = Intent(this, Calculadora_de_Conversao::class.java)
        startActivity(next2)

    }

    private fun opencalcdesc() {
        val next3 = Intent(this, Calculadora_Desconto::class.java)
        startActivity(next3)

    }

}