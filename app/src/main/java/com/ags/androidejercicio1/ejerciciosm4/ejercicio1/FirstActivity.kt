package com.ags.androidejercicio1.ejerciciosm4.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import com.ags.androidejercicio1.R

class FirstActivity : AppCompatActivity() {
    private var register = registerForActivityResult(StartActivityForResult()){ result->
        if(result.resultCode == RESULT_OK){
            if (result.data?.getBooleanExtra("EXTRA_IS_ACTIVITY_BACK", false) == true) {
                onBackPressedDispatcher.onBackPressed()
            }else{
                Toast.makeText( this, "Name = ${result.data?.getStringExtra("EXTRA_NAME")}, LastName = ${result.data?.getStringExtra("EXTRA_LASTNAME")}, Age = ${result.data?.getIntExtra("EXTRA_AGE",0)}, Height = ${result.data?.getDoubleExtra("EXTRA_HEIGHT",0.0)}", Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this,"Cancelado",Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        val btCall = findViewById<Button>(R.id.btCall)
        btCall.setOnClickListener{
            val secondIntent = Intent(this, SecondActivity::class.java).apply {
                putExtra("EXTRA_NAME","Álvaro")
                putExtra("EXTRA_LASTNAME","Gómez Segovia")
                putExtra("EXTRA_AGE",24)
                putExtra("EXTRA_HEIGHT",1.65)
            }
            //startActivity(secondIntent)
            register.launch(secondIntent)
        }
    }

}