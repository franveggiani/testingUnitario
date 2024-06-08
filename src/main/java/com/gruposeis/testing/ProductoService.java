package com.gruposeis.testing;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }



    public Producto crearProducto(Long id, String nombre, int stock){

        Producto producto = new Producto();
        productoRepository.save(producto);

        return producto;

    }


}
