package com.example.a2dam.damirrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Element> hoteles;
    RecyclerView rvHoteles;
    RecyclerView.LayoutManager rvLayoutManager;
    ElementAdapter elementAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHoteles = (RecyclerView)findViewById(R.id.listado);

        //Crear los datos

        //Layout Manager

        //Seteando el layout manager

        //Asignando elementAdapter

    }
}
