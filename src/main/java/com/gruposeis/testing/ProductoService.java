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

    public void actualizarStock(Producto producto, int cantidad) {
        producto.setStock(cantidad);
    }

    public void marcarProductoComoBaja(Producto producto) {
        producto.marcarComoBaja();
    }

    public Optional<Integer> consultarStock(Producto producto) {
        return Optional.ofNullable(producto.getStock());
    }

}