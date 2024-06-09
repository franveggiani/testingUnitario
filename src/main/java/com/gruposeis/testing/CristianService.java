package com.gruposeis.testing;

import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CristianService {

    public CristianService(){

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