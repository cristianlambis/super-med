package com.suepermed.productos;

import com.suepermed.IProducto;

public class Mascotas extends Producto{
    public Mascotas(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public String getCategoria() {
        return "Mascotas";
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
