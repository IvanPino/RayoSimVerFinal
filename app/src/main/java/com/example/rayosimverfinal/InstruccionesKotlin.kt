package com.example.rayosimverfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class InstruccionesKotlin : AppCompatActivity() {
    val frasesH = arrayOf("1° Colocar el celular al exterior de la caja, donde usted pueda observar los parámetros",
        "2° Seleccione al paciente a partir de la lista presentada", "3° Ingrese los parámetros correctos","4° Mueva la caja según corresponda",
        "5° Prepare y posicione al paciente", "6° Realize la simulación")

    var b = true

    var buttoniniciar : Button? = null
    var button2pausar : Button? = null
    var button3reanudar : Button? = null
    var btnarecycler : Button? = null
    var frases : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones_kotlin)

        buttoniniciar = findViewById(R.id.buttoniniciar)
        button2pausar = findViewById(R.id.button2pausar)
        button3reanudar = findViewById(R.id.button3reanudar)
        btnarecycler = findViewById(R.id.btnarecycler)
        frases = findViewById(R.id.frases)

        btnarecycler!!.setOnClickListener {
            startActivity(Intent(this, SeleccionPosicionamiento::class.java))
        }

        buttoniniciar!!.setOnClickListener {
            var hilo = HiloUno(this)
            hilo.start()
            b =true
        }
        button2pausar!!.setOnClickListener {
            b= false
        }
        button3reanudar!!.setOnClickListener {
            b= true
        }
    }
}
class HiloUno(activity: InstruccionesKotlin) :Thread(){
    var i = 0
    var act = activity
    var tamaño = act.frasesH.size
    override fun run() {
        super.run()
        while (true){
            act.runOnUiThread {
                if (act.b==false){
                    act.frases!!.setText(act.frasesH.get(i))
                }
                else{
                    act.frases!!.setText(act.frasesH.get(i))
                    i++
                    if (i==tamaño)
                        i=0
                }
            }
            Thread.sleep(3000)
        }
    }
}