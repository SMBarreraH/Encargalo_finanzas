package com.example.encargalofinanzas.ui.flujo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.encargalofinanzas.R;

public class plantilla_financiera extends Fragment {

    Button btn_negocio;
    Button btn_costos;
    Button btn_manufacturas;
    Button btn_personal;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootview =inflater.inflate(R.layout.activity_plantilla_financiera, container, false);
        btn_personal=rootview.findViewById(R.id.btn_personal);
        btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_personal);
            }
        });

        btn_negocio=rootview.findViewById(R.id.btn_negocio);
        btn_negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_registrar_negocio);
            }
        });
        btn_costos=rootview.findViewById(R.id.btn_costos);
        btn_costos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_costos);
            }
        });
        btn_manufacturas=rootview.findViewById(R.id.btn_manufacturas);
        btn_manufacturas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_manufactura);
            }
        });
        return rootview;
    }
}