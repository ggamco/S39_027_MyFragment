package com.gmbdesign.adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.gmbdesign.main.R;
import com.gmbdesign.model.Libro;

/**
 * Created by ggamboa on 13/4/17.
 */

public class LibroAdapter extends ArrayAdapter<Libro> {

    private Activity contexto;
    private Libro[] datos;

    /**
     * Este constructor tiene una estructura personalizada para ser usada desde la
     * invocación de un fragment
     *
     * @param contexto
     */
    public LibroAdapter(Fragment contexto, Libro[] datos) {
        super(contexto.getActivity(), R.layout.fragment_listado, datos);
        this.contexto = contexto.getActivity();
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View item = null;

        if(convertView == null){
            //inflamos la vista
            LayoutInflater inflater = contexto.getLayoutInflater();
            item = inflater.inflate(R.layout.fila, null);

        } else {
            //reciclamos la vista
            item = convertView;

        }

        //seteamos los datos en los textView
        TextView titulo = (TextView) item.findViewById(R.id.titulo);
        titulo.setText(datos[position].getTitulo());

        TextView autor = (TextView) item.findViewById(R.id.autor);
        autor.setText(datos[position].getAutor());

        return item;

    }
}
