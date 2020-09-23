package com.example.appalumnosdeprimaria.temasPrimerGrado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appalumnosdeprimaria.R;
import com.example.appalumnosdeprimaria.temasPrimerGrado.MenuMatematicasPrimero;
import com.example.appalumnosdeprimaria.temasPrimerGrado.matematicas.Tema1;

public class MenuMatematicasPrimero extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_matematicas_primero);
    }

    public void verTema1(View view){
        Intent i_tema1 = new Intent(this, Tema1.class);
        startActivity(i_tema1);
    }


}