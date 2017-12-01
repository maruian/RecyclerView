package com.example.a2dam.damirrecyclerview;

/**
 * Created by 2dam on 30/11/2017.
 */

public class Element {
    String nombre;
    String direccion;
    String precio;
    float puntuacion;
    int imagen;

    public Element(String nombre, String direccion, String precio, float puntuacion, int imagen) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
        this.puntuacion = puntuacion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
