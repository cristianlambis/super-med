package com.suepermed.productos;

import com.suepermed.IProducto;
import com.suepermed.enums.Categoria;

public class  Alimentacion extends Producto {

    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    @Override
    public boolean esCompatible(IProducto p) {
        // TODO Auto-generated method stub
        return false;
    }
}
