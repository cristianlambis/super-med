package com.suepermed.productos;

import com.suepermed.IProducto;

public class Drogueria extends Producto{
    public Drogueria(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Drogueria";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
