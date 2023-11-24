package com.example.encargalofinanzas.ui.flujo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.encargalofinanzas.R;

public class fragment_home extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        Button myButton = rootView.findViewById(R.id.btn_inicio_sesion);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí navega a la acción de destino
                Navigation.findNavController(v).navigate(R.id.action_nav_home_to_nav_plantilla_financiera2);
            }
        });

        return rootView;
    }
}
