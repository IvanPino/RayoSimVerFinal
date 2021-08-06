package com.example.rayosimverfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Disclaimer extends AppCompatActivity {

    Button botonsiguiente2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disclaimer);
        botonsiguiente2=(Button)findViewById(R.id.botonsiguiente2);

        botonsiguiente2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Disclaimer.this, SeleccionarPaciente.class); //No puedo entrar a la clase seleccionar_paciente, con otras clases si me funciona
                startActivity(i);
            }
        });
    }
}