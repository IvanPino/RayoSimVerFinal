package com.example.rayosimverfinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_seleccion_posicionamiento.*

class SeleccionPosicionamiento : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccion_posicionamiento)

        val sharedPreferences = application.getSharedPreferences("preferences", MODE_PRIVATE)
        val mainViewModelFactory = MainViewModelFactory(sharedPreferences)

        mainViewModel = ViewModelProvider(this, mainViewModelFactory).get(MainViewModel::class.java)

        btnRoll3.setOnClickListener {
            startActivity(Intent(this, ConsolaComandosKotlin::class.java))}

        btnRoll2.setOnClickListener {
            startActivity(Intent(this, UserlistActivity::class.java))}

        btnRoll.setOnClickListener { mainViewModel.onBtnRollPressed() }

        mainViewModel.luckyNumber.observe(this, Observer {
            tvLuckyNumber.text = it
        })
    }

}