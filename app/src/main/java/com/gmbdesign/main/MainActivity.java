package com.gmbdesign.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gmbdesign.fragments.FragmentDetalle;
import com.gmbdesign.fragments.FragmentListado;
import com.gmbdesign.model.Libro;

/**
 * La actividad padre es la encargada de comunicar a los dos fragment.
 * Es por esto que para realizar la practica master - detail debemos pasar la actividad al
 * Fragment LISTADO para que desde el listado podamos contactar, con esta referencia, con el
 * Fragment DETALLE
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        FragmentListado fragmentListado = (FragmentListado) fm.findFragmentById(R.id.fragment_listado);
        fragmentListado.recibirActividadPadre(this);
    }

    public void mostrarDetalle(Libro libro){

        FragmentManager fm = getSupportFragmentManager();
        FragmentDetalle fragmentDetalle = (FragmentDetalle) fm.findFragmentById(R.id.fragment_detalle);
        fragmentDetalle.cargarResumen(libro.getResumen());
    }
}
