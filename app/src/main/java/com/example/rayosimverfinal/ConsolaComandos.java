package com.example.rayosimverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConsolaComandos extends AppCompatActivity {

    Button botonaexamenrealizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consola_comandos);
        botonaexamenrealizado=(Button)findViewById(R.id.botonaexamenrealizado);

        botonaexamenrealizado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ConsolaComandos.this, ExamenRealizado.class); //No puedo entrar a la clase seleccionar_paciente, con otras clases si me funciona
                startActivity(i);
            }
        });
    }
}