package com.example.recyclerviewfragment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Holder extends RecyclerView.ViewHolder {

    TextView texto;
    Context context;

    public Holder(@NonNull View itemView, Context context) {
        super(itemView);
        this.context = context;
        texto = itemView.findViewById(R.id.texto);

    }

    public void bind(Datos datos)
    {
        texto.setText(datos.getNombre());
    }
}
