package com.example.appalumnosdeprimaria.temasPrimerGrado.matematicas;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appalumnosdeprimaria.R;

public class MainAdapterTema1 extends BaseAdapter {
    private Context mContext;
    LayoutInflater inflater;

    // Constructor
    public MainAdapterTema1(Context c) {
        mContext = c;
        inflater = (LayoutInflater.from(c));
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView;


        if (convertView == null) {
            convertView=inflater.inflate(R.layout.row_item, null);
            imageView = new ImageView(mContext);

        }

        imageView = (ImageView) convertView.findViewById(R.id.imageView1);
        imageView.setImageResource(mThumbIds[position]);
        return convertView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.tarjeta_uno, R.drawable.tarjeta_dos, R.drawable.tarjeta_tres, R.drawable.tarjeta_cuatro,
            R.drawable.tarjeta_cinco, R.drawable.tarjeta_seis, R.drawable.tarjeta_siete, R.drawable.tarjeta_ocho,
            R.drawable.tarjeta_nueve, R.drawable.tarjeta_diez};

}
