package com.example.rayosimverfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ExamenRealizadoKotlin : AppCompatActivity() {

    var bot_volveramainkt : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_examen_realizado_kotlin)

        bot_volveramainkt =findViewById(R.id.bot_volveramainkt)

        bot_volveramainkt!!.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}

