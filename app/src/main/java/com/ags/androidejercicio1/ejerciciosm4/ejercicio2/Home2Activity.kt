package com.ags.androidejercicio1.ejerciciosm4.ejercicio2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ags.androidejercicio1.R

class Home2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val btFrame = findViewById<Button>(R.id.btFrame)

        btFrame.setOnClickListener {
            val intent = Intent(this, FrameActivity::class.java)
            startActivity(intent)
        }

        val btLinear = findViewById<Button>(R.id.btLinear)

        btLinear.setOnClickListener {
            val intent = Intent(this, LinearActivity::class.java)
            startActivity(intent)
        }

        val btRelative = findViewById<Button>(R.id.btRelative)

        btRelative.setOnClickListener {
            val intent = Intent(this, RelativeActivity::class.java)
            startActivity(intent)
        }

        val btConstraint = findViewById<Button>(R.id.btConstraint)

        btConstraint.setOnClickListener {
            val intent = Intent(this, ConstraintActivity::class.java)
            startActivity(intent)
        }

        val btComponent = findViewById<Button>(R.id.btComponent)

        btComponent.setOnClickListener {
            val intent = Intent(this, SelectionComponentActivity::class.java)
            startActivity(intent)
        }

        val btRecycler = findViewById<Button>(R.id.btRecycler)

        btRecycler.setOnClickListener {
            val intent = Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }


    }
}