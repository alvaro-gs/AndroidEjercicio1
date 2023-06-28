package com.ags.androidejercicio1.ejerciciosm4.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.Toast
import com.ags.androidejercicio1.R

class SelectionComponentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection_component)

        val cbCreditCard = findViewById<CheckBox>(R.id.cbCreditCard)
        val btSend = findViewById<Button>(R.id.btSend)
        val rgSex = findViewById<RadioGroup>(R.id.rgSex)

        cbCreditCard.setOnCheckedChangeListener { _ , isChecked ->
            Toast.makeText(this, "isChecked = $isChecked", Toast.LENGTH_SHORT).show()
        }

        rgSex.setOnCheckedChangeListener { group, checkedId ->
            val idName = when(checkedId){
                R.id.rbMan -> "Hombre"
                R.id.rbWoman -> "Mujer"
                else -> "Desconocido"
            }
            Toast.makeText(this, "checkId = $idName", Toast.LENGTH_SHORT).show()
        }

        val spinner = findViewById<Spinner>(R.id.spinner)
        val datos = arrayListOf("Mexico","España","Dinamarca","Estados Unidos","Venezuela","Colombia")
        val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item,datos)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adaptador

        spinner.onItemSelectedListener = object: OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val itemSelected = datos[position]
                Toast.makeText(this@SelectionComponentActivity, "Item seleccionado = $itemSelected", Toast.LENGTH_SHORT).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@SelectionComponentActivity, "Nada seleccionado", Toast.LENGTH_SHORT).show()
            }


        }


        btSend.setOnClickListener {
            val cbStatus = cbCreditCard.isChecked
            val selectedRbSex =  when(rgSex.checkedRadioButtonId) {
                R.id.rbMan -> "H" //cbCreditCard.visibility = View.GONE View.VISIBLE View.INVISIBLE
                R.id.rbWoman -> "M"
                else -> "Desconocido"
            }
            Toast.makeText(this, "Tarjeta = $cbStatus, Sexo = $selectedRbSex", Toast.LENGTH_SHORT).show()
        }
    }
}