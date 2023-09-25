package com.example.encargalofinanzas;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class registrar_negocio extends AppCompatActivity {

    private Button btn_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_negocio);

        btn_volver = (Button)findViewById(R.id.button_volver);



    }
}