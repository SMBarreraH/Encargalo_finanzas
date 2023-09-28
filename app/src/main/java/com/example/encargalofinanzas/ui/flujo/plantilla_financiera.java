package com.example.encargalofinanzas.ui.flujo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.encargalofinanzas.R;

public class plantilla_financiera extends Fragment {

    Button btn_negocio;
    Button btn_costos;
    Button btn_manufacturas;
    Button btn_personal;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.activity_plantilla_financiera, container, false);
        btn_personal=view.findViewById(R.id.btn_personal);
        btn_personal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_personal);
            }
        });

        btn_negocio=view.findViewById(R.id.btn_negocio);
        btn_negocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_registrar_negocio);
            }
        });
        btn_costos=view.findViewById(R.id.btn_costos);
        btn_costos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_costos);
            }
        });
        btn_manufacturas=view.findViewById(R.id.btn_manufacturas);
        btn_manufacturas.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_manufactura);
            }
        });
        return view;
    }
}