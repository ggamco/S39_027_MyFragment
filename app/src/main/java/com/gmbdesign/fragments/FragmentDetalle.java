package com.gmbdesign.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gmbdesign.main.R;

/**
 * Created by ggamboa on 13/4/17.
 */

public class FragmentDetalle extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.fragment_detalle, container, false);
    }

    public void cargarResumen(String resumen){
        TextView txtDetalle = (TextView) getView().findViewById(R.id.txtDetalle);
        txtDetalle.setText(resumen);
    }
}
