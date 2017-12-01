package com.example.a2dam.damirrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by 2dam on 30/11/2017.
 */

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ElementHolder> {

    private ArrayList<Element> listaHoteles;

    @Override
    public ElementHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.element,parent,false);
        return new ElementHolder(v);
    }

    @Override
    public void onBindViewHolder(ElementHolder holder, int position) {
        holder.nombre.setText(listaHoteles.get(position).getNombre());
        holder.puntuacion.setRating(listaHoteles.get(position).getPuntuacion());
        holder.nombre.setText(listaHoteles.get(position).getPrecio()+"");
        holder.direccion.setText(listaHoteles.get(position).getDireccion());
        holder.imagen.setImageResource(listaHoteles.get(position).getImagen());

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }


    public static class ElementHolder extends RecyclerView.ViewHolder {
        TextView nombre, direccion, precio;
        RatingBar puntuacion;
        ImageView imagen;

        public ElementHolder(View itemView) {
            super(itemView);

            nombre = (TextView) itemView.findViewById(R.id.nombre);
            direccion = (TextView) itemView.findViewById(R.id.direccion);
            precio = (TextView) itemView.findViewById(R.id.precio);
            puntuacion = (RatingBar) itemView.findViewById(R.id.estrellas);
            imagen = (ImageView) itemView.findViewById(R.id.imatge);

        }
    }
}
