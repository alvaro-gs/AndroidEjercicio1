package com.ags.androidejercicio1.ejerciciosm4.ejercicio1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ags.androidejercicio1.R

class IntentImplicitoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_implicito)

        val btSend = findViewById<Button>(R.id.btSend)
        val btUrl = findViewById<Button>(R.id.btUrl)


        btSend.setOnClickListener{
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:")
                putExtra(Intent.EXTRA_SUBJECT,"Aviso urgente")
                putExtra(Intent.EXTRA_TEXT,"Esto es una prueba para enviar correo mediante un intent implícito")
            }
            startActivity(Intent.createChooser(emailIntent,"Enviar email usando..."))
        }

        btUrl.setOnClickListener{
            val urlIntent = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"))
            startActivity(urlIntent)

        }

    }
}