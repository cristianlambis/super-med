package com.suepermed.productos;

import com.suepermed.IProducto;
import com.suepermed.enums.Categoria;

public class Mascotas extends Producto{
    public Mascotas(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.MASCOTAS;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        return false;
    }
}
