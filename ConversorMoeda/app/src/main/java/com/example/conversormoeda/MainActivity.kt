package com.example.conversormoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cotacaoEdt = findViewById<EditText>(R.id.cotacaoEdt)
        val moedaEdt = findViewById<EditText>(R.id.moedaEdt)
        val calcularBtn = findViewById<Button>(R.id.calcularBtn)
        val resultadoTv = findViewById<TextView>(R.id.resultadoTv)

        calcularBtn.setOnClickListener {
            val valorCotacaoEdt = cotacaoEdt.text.toString()
            val valorMoedaEdt = moedaEdt.text.toString()

            if (valorCotacaoEdt.trim().isNotEmpty() && valorMoedaEdt.trim().isNotEmpty()) {
                val valorCotacao: Double = valorCotacaoEdt.toDouble()
                val valorMoeda: Double = valorMoedaEdt.toDouble()
                var valorReal = valorCotacao * valorMoeda

                resultadoTv.text = "O valor em real é: R$" + valorReal
            } else {
                Toast.makeText(
                    this,
                    "É necessário digitar os valores",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
