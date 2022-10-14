package com.davidcai.pmdm.ut01.ex06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.davidcai.pmdm.R
import com.davidcai.pmdm.ut01.ex06.domain.Cat

class Ut01Ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex06)

        setupView()
    }


    private fun setupView() {
        val inputName = findViewById<EditText>(R.id.inputName)
        val inputSurname = findViewById<EditText>(R.id.inputSurname)
        val actionSave = findViewById<Button>(R.id.actionSave)



        val cat = Cat(
            inputName.text.toString(),
            inputSurname.text.toString()
        )
        Log.d("@dev", "Cat: $cat")



        actionSave.setOnClickListener {
            Log.d("@dev", "clicked")
        }


        actionSave.setOnLongClickListener {
            Log.d("@dev", "long clicked")
            true
        }


        //con esto guardamos el nombre al pulsar el boton

        actionSave.setOnClickListener {
            inputName.text.toString()
        }

        // comprobacion
        actionSave.setOnClickListener {
            Log.d("@dev", "name :${inputName.text.toString()}")
        }

    }
}