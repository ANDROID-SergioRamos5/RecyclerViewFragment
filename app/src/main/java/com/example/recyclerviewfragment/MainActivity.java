package com.example.recyclerviewfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    Datos[] datos;
    RecyclerView recyclerView;
    Adaptador adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        añadirDatos();

        recyclerView = findViewById(R.id.recycler);

        adaptador = new Adaptador(this);
        recyclerView.setAdapter(adaptador);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

    }

    private void añadirDatos()
    {
        datos = new Datos[]{
                new Datos("Sergio"),
                new Datos("Carlos"),
                new Datos("Ivan"),
                new Datos("Aitor"),
                new Datos("Ismael"),
                new Datos("Marhoz")
        };
    }
}
