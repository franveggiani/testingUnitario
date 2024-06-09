package com.gruposeis.testing;

import org.springframework.stereotype.Service;

@Service
public class FrancoService {

    public FrancoService(){

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

    public BandaMusical crearMejoresBandasDeLaHistoria(String nombre){
        return new BandaMusical(nombre);
    }



}