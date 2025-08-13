package com.example.mensagem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referências aos elementos visuais da tela
        val editMensagem    = findViewById<EditText>(R.id.edt_Mensagem)
        val btnMostrar      = findViewById<Button>(R.id.btn_Mostrar)
        val txtResultado    = findViewById<TextView>(R.id.txt_Resultado)

        //Evento de clique no botão
        btnMostrar.setOnClickListener {
            val textoDigitado = editMensagem.text.toString()

            if(textoDigitado.isNotEmpty()) {
                txtResultado.text = textoDigitado
            } else {
                txtResultado.text = "Por favor, digite algo!"
            }
        }
    }
}