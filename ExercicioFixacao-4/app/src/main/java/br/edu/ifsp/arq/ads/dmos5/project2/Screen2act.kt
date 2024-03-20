package br.edu.ifsp.arq.ads.dmos5.project2

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen2act : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2act)
        val intent = intent

        val cliente: Cliente? = intent.getSerializableExtra("cliente") as Cliente?

        cliente?.let {cliente ->
            findViewById<TextView>(R.id.text_hello).text = "Olá: ${cliente.getName()}!"
            findViewById<TextView>(R.id.text_email).text = "Email: ${cliente.getEmail()}"
            findViewById<TextView>(R.id.text_telefone).text = "Telefone: ${cliente.getTelefone()}"
            findViewById<TextView>(R.id.text_cpf).text = "CPF: ${cliente.getCpf()}"
            findViewById<TextView>(R.id.text_endereco).text = "Endereço: ${cliente.getEndereco()}"
            findViewById<TextView>(R.id.text_cidade).text = "Cidade: ${cliente.getCidade()}"
        }
    }
}