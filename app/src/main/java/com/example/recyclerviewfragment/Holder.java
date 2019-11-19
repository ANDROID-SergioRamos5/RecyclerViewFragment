package com.example.recyclerviewfragment;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    TextView texto;

    public Holder(@NonNull View itemView) {
        super(itemView);

        texto = itemView.findViewById(R.id.texto);

    }

    public void bind(Datos datos)
    {
        texto.setText(datos.getNombre());
    }
}
