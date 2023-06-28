package com.ags.androidejercicio1.ejerciciosm4.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ags.androidejercicio1.R

class Home1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home1)

        val btImplicito = findViewById<Button>(R.id.btImplicito)

        btImplicito.setOnClickListener {
            val intent = Intent(this, IntentImplicitoActivity::class.java)
            startActivity(intent)
        }

        val btExplicito = findViewById<Button>(R.id.btExplicito)

        btExplicito.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        val btCiclo = findViewById<Button>(R.id.btCiclo)

        btCiclo.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}