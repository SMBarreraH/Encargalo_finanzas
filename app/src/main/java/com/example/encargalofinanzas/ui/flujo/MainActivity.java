package com.example.encargalofinanzas.ui.flujo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.encargalofinanzas.R;
import com.example.encargalofinanzas.ui.flujo.plantilla_financiera;

public class MainActivity extends AppCompatActivity {

    Button btniniciar_sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btniniciar_sesion=(Button)findViewById(R.id.btn_inicio_sesion);
        btniniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), plantilla_financiera.class);
                startActivity(intent);
            }
        });
    }
}