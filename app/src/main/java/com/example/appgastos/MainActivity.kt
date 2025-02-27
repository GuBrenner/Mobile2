package com.example.appgastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(){
        /* classe que calcula e devolve o resultado pro front */
        var distancia = 0f
        var preco =0f
        var autonomia = 0f

        distancia = findViewById<EditText>(R.id.textDistancia).text.toString().toFloat()
        preco = findViewById<EditText>(R.id.textPreco).text.toString().toFloat()
        autonomia = findViewById<EditText>(R.id.textAutonomia).text.toString().toFloat()


        var resultado = (distancia * preco) / autonomia
        var txt_valor = findViewById<TextView>(R.id.textValorTotal)
        txt_valor.text = "R$: ${"%.2f".format(resultado)}"











    }
}