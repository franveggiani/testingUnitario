package com.gruposeis.testing;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Optional;

public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ProductoService(){

    }

    public Producto crearProducto(Long id, String nombre, int stock){
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setStock(stock);

        return producto;
    }

}