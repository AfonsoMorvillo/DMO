package br.edu.ifsp.arq.ads.dmos5.project2

import java.io.Serializable

class Cliente(
    private var name: String,
    private var email: String,
    private var telefone: String,
    private var cpf: String,
    private var endereco: String,
    private var cidade: String
): Serializable {
    fun getName(): String{
        return name;
    }

    fun setName(name: String){
        this.name = name;
    }

    fun getEmail(): String {
        return email;
    }

    fun setEmail(email: String){
        this.email = email;
    }

    fun getTelefone(): String{
        return telefone;
    }

    fun setTelefone(telefone: String){
        this.telefone = telefone;
    }

    fun getCpf(): String{
        return cpf;
    }

    fun setCpf(cpf: String){
        this.cpf = cpf;
    }

    fun getEndereco(): String{
        return endereco;
    }

    fun setEndereco(endereco: String){
        this.endereco = endereco;
    }

    fun getCidade(): String{
        return cidade;
    }

    fun setCidade(cidade: String){
        this.cidade = cidade;
    }

    override fun toString(): String {
        return "Cliente(name='$name', email='$email', telefone='$telefone', cpf='$cpf', endereco='$endereco', cidade='$cidade')"
    }


}
