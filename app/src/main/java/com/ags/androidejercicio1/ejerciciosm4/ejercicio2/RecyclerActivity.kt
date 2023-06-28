package com.ags.androidejercicio1.ejerciciosm4.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.ags.androidejercicio1.R

class RecyclerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        val rvPerson = findViewById<RecyclerView>(R.id.personList)
        val personAdapter = PersonAdapter(
            arrayListOf(
                Person("1", "Juan"),
                Person("2", "Jose"),
                Person("3", "Luis"),
                Person("4", "Maria"),
                Person("5","Álvaro")
            )
        )

        rvPerson.adapter = personAdapter
        rvPerson.layoutManager = LinearLayoutManager(this)
        val dividerItemDecoration = DividerItemDecoration(this,1)
        rvPerson.addItemDecoration(dividerItemDecoration)

    }
}