package com.ags.androidejercicio1.ejerciciosm4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ags.androidejercicio1.R
import com.ags.androidejercicio1.ejerciciosm4.ejercicio1.FirstActivity
import com.ags.androidejercicio1.ejerciciosm4.ejercicio1.Home1Activity
import com.ags.androidejercicio1.ejerciciosm4.ejercicio2.Home2Activity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btStart1 = findViewById<Button>(R.id.btStart1)

        btStart1.setOnClickListener {
            val intent = Intent(this, Home1Activity::class.java)
            startActivity(intent)
        }

        val btStart2 = findViewById<Button>(R.id.btStart2)

        btStart2.setOnClickListener {
            val intent = Intent(this, Home2Activity::class.java)
            startActivity(intent)
        }


    }


}