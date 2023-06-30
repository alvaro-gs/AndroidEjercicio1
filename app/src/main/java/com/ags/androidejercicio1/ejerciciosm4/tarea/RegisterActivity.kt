package com.ags.androidejercicio1.ejerciciosm4.tarea

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.ags.androidejercicio1.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val etName = findViewById<EditText>(R.id.etName)
        val etLastName = findViewById<EditText>(R.id.etLastName)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)


        val spinner = findViewById<Spinner>(R.id.spinnerS)
        val datos = arrayListOf("Ninguno Seleccionado","Masculino","Femenino","Otro")
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,datos)
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador

        var selectedSex = false
        var itemSelected = ""

        spinner.onItemSelectedListener = object :OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if(position == 0){
                    selectedSex = false
                }
                else{
                    itemSelected = datos[position]
                    selectedSex = true

                }

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        val btSend = findViewById<Button>(R.id.btSend)

        btSend.setOnClickListener {
            var error = false
            val bundle = Bundle().apply {

                if(etName.text.isEmpty()) {
                    etName.error = getString(R.string.error)
                    error = true
                }
                else{
                    putString("EXTRA_NAME", etName.text.toString())}

                if(etLastName.text.isEmpty()){
                    etLastName.error = getString(R.string.error)
                    error = true
                }
                else{
                    putString("EXTRA_LASTNAME",etLastName.text.toString())
                }


                if(!selectedSex){
                    Toast.makeText(this@RegisterActivity, "Favor de seleccionar el sexo", Toast.LENGTH_LONG).show()
                    error = true
                }
                else{
                    putString("EXTRA_SEX",itemSelected)
                }
                if(etEmail.text.isEmpty()){
                    etEmail.error = getString(R.string.error)
                    error = true
                }
                else{
                    putString("EXTRA_EMAIL",etEmail.text.toString())
                }

                if(etPassword.text.isEmpty()){
                    etPassword.error = getString(R.string.error)
                    error = true
                }
                else{
                    putString("EXTRA_PASSWORD",etPassword.text.toString())
                }

            }
            if (!error) {
                val sendIntent = Intent(this, DataActivity::class.java).apply {
                    putExtra("KEY_INFO", "Información")
                    putExtra("EXTRA_BUNDLE", bundle)

                }
                startActivity(sendIntent)
            }


        }

    }
}