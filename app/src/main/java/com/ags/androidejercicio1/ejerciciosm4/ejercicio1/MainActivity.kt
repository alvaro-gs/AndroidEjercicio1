package com.ags.androidejercicio1.ejerciciosm4.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ags.androidejercicio1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onCreate")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onStart")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onPause")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
        Log.e("CicloDeVida","onDestroy")

    }
}