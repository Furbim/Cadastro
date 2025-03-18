package com.example.fitnerd

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imgPerfil = findViewById<ImageView>(R.id.img_user);
        val edtNome = findViewById<EditText>(R.id.edt_nome);
        val edtEmail = findViewById<EditText>(R.id.edt_email);
        val edtIdade = findViewById<EditText>(R.id.edt_idade);
        val edtSenha = findViewById<EditText>(R.id.edt_senha);
        val btnCadastro = findViewById<Button>(R.id.btn_cadastro);
        val btnFoto = findViewById<Button>(R.id.btn_enviarFoto);

        var nome = edtNome.text.toString();
        var email = edtEmail.text.toString();
        var idade = edtIdade.text.toString().toInt()
        var senha = edtSenha.text.toString();





    }






}