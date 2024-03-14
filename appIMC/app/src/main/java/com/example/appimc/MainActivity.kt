package com.example.appimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edtPeso: TextView
    lateinit var edtAltura: TextView


    lateinit var btnSend: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtPeso = findViewById(R.id.edt_peso)
        edtAltura = findViewById(R.id.edt_altura)

        btnSend = findViewById(R.id.btn_send)

        btnSend.setOnClickListener(View.OnClickListener {
           val peso: Double = edtPeso.text.toString().toDouble()
            val altura: Double = edtAltura.text.toString().toDouble()

            val stringPeso = edtPeso.text.toString()
            val stringAltura =  edtAltura.text.toString()

            val imc = calculaImc(peso,altura);
            Toast.makeText(
                this@MainActivity, "Seu IMC: ${"%.2f".format(imc)}.Sua condição é: "+getCondicaoByImc(imc), Toast.LENGTH_LONG
            ).show()
        }
        )
    }

    fun calculaImc(peso: Double, altura: Double): Double {
        return peso.div((altura * altura))
    }

    fun getCondicaoByImc(imc: Double): String {
        return when {
            imc < 18.5 -> "Abaixo do peso"
            imc <= 24.9 -> "Peso normal"
            imc <= 29.9 -> "Acima do peso"
            imc > 30 -> "Obeso"
            else -> "Inválido"
        }
    }
}