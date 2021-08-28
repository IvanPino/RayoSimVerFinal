package com.example.rayosimverfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class ConsolaComandosKotlin : AppCompatActivity() {

    var botonaexamenrealizadokt : Button ?= null
    var viewKV : View ? = null
    var viewMAS : View ? = null
    var viewDistancia : View ? = null
    var viewFiltro : View ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consola_comandos_kotlin)

        botonaexamenrealizadokt = findViewById(R.id.botonaexamenrealizadokt)
        viewKV = findViewById(R.id.viewKV)
        viewMAS = findViewById(R.id.viewMAS)
        viewDistancia = findViewById(R.id.viewDistancia)
        viewFiltro = findViewById(R.id.viewFiltro)
        //Reconociendo al objeto (botón)

        viewKV!!.setOnClickListener { Toast.makeText(this, "Definición de KV", Toast.LENGTH_SHORT).show() }
        viewMAS!!.setOnClickListener { Toast.makeText(this, "Definición de MAS", Toast.LENGTH_SHORT).show() }
        viewDistancia!!.setOnClickListener { Toast.makeText(this, "Definición de Distancia", Toast.LENGTH_SHORT).show() }
        viewFiltro!!.setOnClickListener { Toast.makeText(this, "Definición de Filtro", Toast.LENGTH_SHORT).show() }
        //Evento Toast

        botonaexamenrealizadokt!!.setOnClickListener {
            startActivity(Intent(this, ExamenRealizadoKotlin::class.java))
        }
        //Boton de cambio de Actividad








    }


}
