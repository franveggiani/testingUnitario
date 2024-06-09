package com.gruposeis.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class ProductoService {

    public ProductoService(){

    }

    public Producto crearProducto(Long id, String nombre, int stock){
        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setStock(stock);

        return producto;
    }

    public int sumarNumeros(int numero1, int numero2){
        return numero1 + numero2;
    }



}