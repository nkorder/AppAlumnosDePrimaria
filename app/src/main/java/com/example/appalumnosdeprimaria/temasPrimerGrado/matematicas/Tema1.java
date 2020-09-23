package com.example.appalumnosdeprimaria.temasPrimerGrado.matematicas;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appalumnosdeprimaria.R;

public class Tema1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primero_mat_tema1);

        GridView gridview = (GridView) findViewById(R.id.grid_view);
        gridview.setAdapter(new MainAdapterTema1(getApplicationContext()));
    }
}
