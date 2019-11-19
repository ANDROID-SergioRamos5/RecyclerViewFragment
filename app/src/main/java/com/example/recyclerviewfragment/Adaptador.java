package com.example.recyclerviewfragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adaptador extends RecyclerView.Adapter {

    Context context;

    public Adaptador(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view,parent,false);

        return new Holder(v,context);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((Holder)holder).bind(((MainActivity)context).datos[position]);
    }

    @Override
    public int getItemCount() {
        return((MainActivity)context).datos.length;
    }
}
