package com.ags.androidejercicio1.ejerciciosm4.tarea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.ags.androidejercicio1.R

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val bundle = intent.getBundleExtra("EXTRA_BUNDLE")
        bundle.let{
            val name = it?.getString("EXTRA_NAME")
            val lastName = it?.getString("EXTRA_LASTNAME")
            val sex = it?.getString("EXTRA_SEX")
            val email = it?.getString("EXTRA_EMAIL")
            val password = it?.getString("EXTRA_PASSWORD")

            val tvName = findViewById<TextView>(R.id.tvName)
            val tvLastName = findViewById<TextView>(R.id.tvLastName)
            val tvSex = findViewById<TextView>(R.id.tvSex)
            val tvEmail = findViewById<TextView>(R.id.tvEmail)
            val tvPassword = findViewById<TextView>(R.id.tvPassword)

            tvName.text = getString(R.string.datos,"Nombre",name)
            tvLastName.text = getString(R.string.datos,"Apellido",lastName)
            tvSex.text = getString(R.string.datos,"Sexo",sex)
            tvEmail.text = getString(R.string.datos,"Correo",email)
            tvPassword.text = getString(R.string.datos,"Contraseña",password)

        }

        val btReturn = findViewById<Button>(R.id.btReturn)

        btReturn.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)

        }



    }
}