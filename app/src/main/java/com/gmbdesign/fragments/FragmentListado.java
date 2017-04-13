package com.gmbdesign.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gmbdesign.adapters.LibroAdapter;
import com.gmbdesign.listeners.LibroListener;
import com.gmbdesign.main.MainActivity;
import com.gmbdesign.main.R;
import com.gmbdesign.model.Libro;

/**
 * Created by ggamboa on 13/4/17.
 */

public class FragmentListado extends Fragment {

    private Libro[] datos = new Libro[]{
            new Libro("Libro 1", "autor 1", "Resumen 1"),
            new Libro("Libro 2", "autor 2", "Resumen 2"),
            new Libro("Libro 3", "autor 3", "Resumen 3"),
            new Libro("Libro 4", "autor 4", "Resumen 4"),
            new Libro("Libro 5", "autor 5", "Resumen 5"),
            new Libro("Libro 6", "autor 6", "Resumen 6"),
    };

    private MainActivity actividadPadre;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        //este metodo inflará la vista para ser usada
        return inflater.inflate(R.layout.fragment_listado, container, false);

    }

    /**
     * Este metodo cargará el adapter en el listview que se ha inflado
     *
     * @param savedInstanceState
     */
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //getView() -> recuperamos la vista inflada
        ListView listado = (ListView) getView().findViewById(R.id.listado);

        listado.setAdapter(new LibroAdapter(this, datos));

        listado.setOnItemClickListener(new LibroListener(actividadPadre, datos));

    }

    public void recibirActividadPadre(Activity actividadPadre){
        this.actividadPadre = (MainActivity) actividadPadre;
    }
}
