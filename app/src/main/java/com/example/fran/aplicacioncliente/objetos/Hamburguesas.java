package com.example.fran.aplicacioncliente.objetos;

/**
 * Created by Fran on 22/04/2017.
 */

public class Hamburguesas {

    String nombre;
    String ingredientes;
    int identificador;

    public Hamburguesas() {
    }

    public Hamburguesas(String ingredientes, int identificador, String nombre) {
        this.ingredientes = ingredientes;
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
