package com.example.tela_inicial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculadora_de__bolso.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class Calculadora_de_Bolso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora_de__bolso)

        // numeros
        numero_zero.setOnClickListener {criarexpressao ("0" , true)}
        numero_um.setOnClickListener {criarexpressao ("1" , true)}
        numero_dois.setOnClickListener {criarexpressao ("2" , true)}
        numero_tres.setOnClickListener {criarexpressao ("3" , true)}
        numero_quatro.setOnClickListener {criarexpressao ("4" , true)}
        numero_cinco.setOnClickListener {criarexpressao ("5" , true)}
        numero_seis.setOnClickListener {criarexpressao ("6" , true)}
        numero_sete.setOnClickListener {criarexpressao ("7" , true)}
        numero_oito.setOnClickListener {criarexpressao ("8" , true)}
        numero_nove.setOnClickListener {criarexpressao ("9" , true)}
        numero_ponto.setOnClickListener { criarexpressao("." , true) }

        //operadores
        soma.setOnClickListener {criarexpressao("+" , false)}
        subtracao.setOnClickListener {criarexpressao("-" , false)}
        divisao.setOnClickListener {criarexpressao("/" , false)}
        multiplicacao.setOnClickListener {criarexpressao("*" , false)}

        limpar.setOnClickListener {
            expressao.text = ""
            result.text = "0"
        }

        numero_backspace.setOnClickListener {
            val string = expressao.text.toString()
            if (string.isNotBlank()){
                expressao.text = string.substring(0, string.length-1)
            }
            result.text = " "
        }
        igual.setOnClickListener {
            try {
                val expressao = ExpressionBuilder(expressao.text.toString()).build()
                val resultado = expressao.evaluate()
                val longres = resultado.toLong()

                if (resultado == longres.toDouble())
                    result.text = longres.toString()
                else
                    result.text = resultado.toString()

            }catch (e: Exception){

            }
        }

    }

    fun criarexpressao(string: String, limpar_dados :Boolean) {
        if  (result.text.isNotEmpty()){
            expressao.text = ""
        }
        if (limpar_dados){
            result.text = ""
            expressao.append(string)
        }else{
            expressao.append(result.text)
            expressao.append(string)
            result.text = ""
        }

    }

}
