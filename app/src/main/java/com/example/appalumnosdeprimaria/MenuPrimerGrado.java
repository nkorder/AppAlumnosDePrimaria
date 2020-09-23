package com.example.appalumnosdeprimaria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appalumnosdeprimaria.temasPrimerGrado.MenuMatematicasPrimero;

public class MenuPrimerGrado extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_primer_grado);
    }

    /* public void menuEducacionSocioemocionalPrimero(View view){
        Intent i1 = new Intent(this, MenuPrimerGrado.class);
        startActivity(i1);
    } */

    public void menuMatematicasPrimero(View view){
        Intent i_matematicas = new Intent(this, MenuMatematicasPrimero.class);
        startActivity(i_matematicas);
    }
}
