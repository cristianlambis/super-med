package com.suepermed.productos;

import com.suepermed.IContenedor;
import com.suepermed.IProducto;

public abstract class Producto implements IProducto {

    private String referencia;
    private int peso;
    private int volumen;

    public Producto(String referencia, int peso, int volumen) {
        this.referencia = referencia;
        this.peso = peso;
        this.volumen = volumen;
    }

    @Override
    public String getReferencia() {
        return referencia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean tengoEspacio(IContenedor contenedor) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void meter(IContenedor contenedor) {
        // TODO Auto-generated method stub

    }

}

