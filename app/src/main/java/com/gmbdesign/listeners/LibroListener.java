package com.gmbdesign.listeners;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;

import com.gmbdesign.main.MainActivity;
import com.gmbdesign.model.Libro;

/**
 * Created by ggamboa on 13/4/17.
 */

public class LibroListener implements AdapterView.OnItemClickListener {

    private MainActivity actividadPadre;
    private Libro[] datos;

    public LibroListener(Activity actividadPadre, Libro[] datos){
        this.actividadPadre = (MainActivity) actividadPadre;
        this.datos = datos;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        actividadPadre.mostrarDetalle(datos[position]);
    }
}
