package com.example.rayosimverfinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SeleccionarPaciente extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    String monthNames[]={"Elba Surero","Armando Bronca Segura","Inés Tornudo","Lola Mento",
            "Zacarias Flores Del Campo","Elton Tito","Elba Surero","Armando Bronca Segura",
            "Inés Tornudo","Lola Mento","Zacarias Flores Del Campo","Elton Tito",
            "Elba Surero","Armando Bronca Segura","Inés Tornudo","Lola Mento",
            "Zacarias Flores Del Campo","Elton Tito", "Elba Surero","Armando Bronca Segura",
            "Inés Tornudo","Lola Mento","Zacarias Flores Del Campo","Elton Tito"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_paciente); //problema:cambiar(R.layout.activity_main)
        getSupportActionBar().hide();

        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new RecyclerAdapter(this, monthNames); //10:29
        recyclerView.setAdapter(adapter);
    }
}