package com.example.rayosimverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExamenRealizado extends AppCompatActivity {

    Button bot_volveramain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examen_realizado);
        bot_volveramain=(Button)findViewById(R.id.bot_volveramainkt);

        bot_volveramain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ExamenRealizado.this, MainActivity.class); //No puedo entrar a la clase seleccionar_paciente, con otras clases si me funciona
                startActivity(i);
            }
        });
    }
}