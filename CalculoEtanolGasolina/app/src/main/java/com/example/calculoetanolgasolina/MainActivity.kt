package br.com.unipac.calculoetanolgasolina

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

        val gasolinaEdt = findViewById<EditText>(R.id.gasolinaEdt)
        val etanolEdt = findViewById<EditText>(R.id.etanolEdt)
        val calcularBtn = findViewById<Button>(R.id.calcularBtn)
        val resultadoTv = findViewById<TextView>(R.id.resultadoTv)

        calcularBtn.setOnClickListener {
            val valorGasolinaEdt = gasolinaEdt.text.toString()
            val valorEtanolEdt = etanolEdt.text.toString()

            if (valorGasolinaEdt.trim().isNotEmpty() && valorEtanolEdt.trim().isNotEmpty()) {

                val valorGasolina: Double = valorGasolinaEdt.toDouble()
                val valorEtanol: Double = valorEtanolEdt.toDouble()
                var valorMedia = valorGasolina / valorEtanol

                if (valorMedia < 0.7) {
                    resultadoTv.text = "Nesse caso é melhor colocar Etanol"
                } else {
                    resultadoTv.text = "Nesse caso é melhor colocar Gasolina"
                }
            } else {
                Toast.makeText(
                    this,
                    "É necessário digitar os valores dos combustíveis",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}