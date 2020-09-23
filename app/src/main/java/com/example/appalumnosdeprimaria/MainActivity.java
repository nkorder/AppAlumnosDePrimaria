package com.example.appalumnosdeprimaria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirMenuPrimerGrado(View view){
        Intent i1 = new Intent(this, MenuPrimerGrado.class);
        startActivity(i1);
    }

    public void abrirMenuSegundoGrado(View view){
        Intent i2 = new Intent(this, MenuSegundoGrado.class);
        startActivity(i2);
    }

    public void abrirMenuTercerGrado(View view){
        Intent i3 = new Intent(this, MenuTercerGrado.class);
        startActivity(i3);
    }

    public void abrirMenuCuartoGrado(View view){
        Intent i4 = new Intent(this, MenuCuartoGrado.class);
        startActivity(i4);
    }

    public void abrirMenuQuintoGrado(View view){
        Intent i5 = new Intent(this, MenuQuintoGrado.class);
        startActivity(i5);
    }

    public void abrirMenuSextoGrado(View view){
        Intent i6 = new Intent(this, MenuSextoGrado.class);
        startActivity(i6);
    }
}
