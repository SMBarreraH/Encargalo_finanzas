package com.example.encargalofinanzas.ui.flujo;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.encargalofinanzas.R;

public class MainActivity extends AppCompatActivity {

    private NavController navController;

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtén una referencia al NavController del NavHostFragment
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerView3);
        navController = navHostFragment.getNavController();

        appBarConfiguration = new AppBarConfiguration.Builder(R.id.fragmentContainerView3, R.id.nav_plantilla_financiera)
                .build();

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        }
    }

}
