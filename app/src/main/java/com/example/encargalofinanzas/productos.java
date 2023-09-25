package com.example.encargalofinanzas;

import android.os.Bundle;
import android.widget.TableLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class productos extends AppCompatActivity {

    private TableLayout tableLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);

        TabLayout tableLayout = findViewById(R.id.tablayoutProductos);
        ViewPager viewPager = findViewById(R.id.viewpagerProductos);

        tableLayout.setupWithViewPager(viewPager);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new listadoProductos(),"Listado");
        vpAdapter.addFragment(new manoDeObra(),"Mano de Obra");
        vpAdapter.addFragment(new fragm_materiaPrima(),"Materia prima");
        viewPager.setAdapter(vpAdapter);


    }
}