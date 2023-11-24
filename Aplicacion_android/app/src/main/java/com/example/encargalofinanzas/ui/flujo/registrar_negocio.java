package com.example.encargalofinanzas.ui.flujo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.encargalofinanzas.R;

public class registrar_negocio extends Fragment {


    Button btn_volver;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_registrar_negocio, container, false);
      //  btn_volver=view.findViewById(R.id.btn_volver);
        btn_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_nav_mi_flujo_to_plantilla_financiera);
            }
        });

        return view;
    }
}