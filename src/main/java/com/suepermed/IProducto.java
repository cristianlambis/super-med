package com.suepermed;

import com.suepermed.enums.Categoria;

public interface IProducto {

    String getReferencia();

    int getPeso();

    int getVolumen();

    Categoria getCategoria();

    boolean esCompatible(IProducto p);

    boolean tengoEspacio(IContenedor contenedor);

    void meter(IContenedor contenedor);
}
