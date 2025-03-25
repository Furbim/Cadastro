package com.example.fitnerd

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fitnerd.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }




        binding.btnCadastro.setOnClickListener{
            exibirInformacoes();
        }



    }

    fun exibirInformacoes(){

        val nome = binding.edtNome.text.toString();
        Log.d("INFO_CLIENT","NOME: ${nome}");

        val email = binding.edtEmail.text.toString();
        Log.d("INFO_CLIENT","EMAIL: ${email}");

        val idade = binding.edtIdade.text.toString().toInt();
        Log.d("INFO_CLIENT","IDADE: ${idade}");

        val senha = binding.edtSenha.text.toString();
        Log.d("INFO_CLIENT","SENHA: ${senha}");
    }
}