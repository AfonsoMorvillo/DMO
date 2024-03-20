package br.edu.ifsp.arq.ads.dmos5.project2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var edtName: TextView
    lateinit var edtEmail: TextView
    lateinit var edtCpf: TextView
    lateinit var edtTelefone: TextView
    lateinit var edtEndereco: TextView
    lateinit var edtCidade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edt_name)
        edtEmail = findViewById(R.id.edt_email)
        edtCpf = findViewById(R.id.edt_cpf)
        edtEndereco = findViewById(R.id.edt_endereco)
        edtTelefone = findViewById(R.id.edt_telefone)
        edtCidade = findViewById(R.id.edt_cidade)

        Log.d("ciclo", getClassName() + ".onCreate() foi chamado.")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ciclo", getClassName() + ".onStart() foi chamado.")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ciclo", getClassName() + ".onResume() foi chamado.")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ciclo", getClassName() + ".onPause() foi chamado.")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ciclo", getClassName() + ".onStop() foi chamado.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ciclo", getClassName() + ".onRestart() foi chamado.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ciclo", getClassName() + ".onDestroy() foi chamado.")
    }

    private fun getClassName(): String {
        val nomeClasse = javaClass.name
        return nomeClasse.substring(nomeClasse.lastIndexOf("."))
    }

    fun onClickBtnSend(view: View?) {
        val intent = Intent(this, Screen2act::class.java)

        // enviar um objeto da classe Cliente
        val cliente = getCliente()
        intent.putExtra("cliente", cliente)

        startActivity(intent)
    }

    private fun getCliente(): Cliente {
        val nome: String = edtName.text.toString()
        val email: String = edtEmail.text.toString()
        val telefone: String = edtTelefone.text.toString()
        val cpf: String = edtCpf.text.toString()
        val endereco: String = edtEndereco.text.toString()
        val cidade: String = edtCidade.text.toString()

        return Cliente(nome, email, telefone, cpf, endereco, cidade)
    }
}