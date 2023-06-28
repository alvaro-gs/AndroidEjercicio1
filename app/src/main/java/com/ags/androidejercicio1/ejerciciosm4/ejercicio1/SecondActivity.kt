package com.ags.androidejercicio1.ejerciciosm4.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import com.ags.androidejercicio1.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val name = intent.getStringExtra("EXTRA_NAME")
        val lastName = intent.getStringExtra("EXTRA_LASTNAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val height = intent.getDoubleExtra("EXTRA_HEIGHT",0.0)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvLastName = findViewById<TextView>(R.id.tvLastName)
        val tvAge= findViewById<TextView>(R.id.tvAge)
        val tvHeight = findViewById<TextView>(R.id.tvHeight)

        tvName.text = name
        tvLastName.text = lastName
        tvAge.text = age.toString()
        tvHeight.text = height.toString()

        val btBack = findViewById<Button>(R.id.btBack)

        btBack.setOnClickListener{
            val returnIntent = Intent().apply{
                putExtra("EXTRA_NAME",name)
                putExtra("EXTRA_LASTNAME",lastName)
                putExtra("EXTRA_AGE",age)
                putExtra("EXTRA_HEIGHT",height)

            }
            setResult(RESULT_OK,returnIntent)
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val name = intent.getStringExtra("EXTRA_NAME")
        val lastName = intent.getStringExtra("EXTRA_LASTNAME")
        val age = intent.getIntExtra("EXTRA_AGE",0)
        val height = intent.getDoubleExtra("EXTRA_HEIGHT",0.0)

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvLastName = findViewById<TextView>(R.id.tvLastName)
        val tvAge= findViewById<TextView>(R.id.tvAge)
        val tvHeight = findViewById<TextView>(R.id.tvHeight)

        tvName.text = name
        tvLastName.text = lastName
        tvAge.text = age.toString()
        tvHeight.text = height.toString()

        when (item.itemId){
            android.R.id.home -> {
                val returnIntent = Intent().apply{
                    putExtra("EXTRA_NAME",name)
                    putExtra("EXTRA_LASTNAME",lastName)
                    putExtra("EXTRA_AGE",age)
                    putExtra("EXTRA_HEIGHT",height)
                    putExtra("EXTRA_IS_ACTIVITY_BACK",true)

                }
                setResult(RESULT_OK,returnIntent)
                onBackPressedDispatcher.onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }


}