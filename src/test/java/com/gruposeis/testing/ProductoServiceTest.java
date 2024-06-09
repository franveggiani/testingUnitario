package com.gruposeis.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
public class ProductoServiceTest {
    @Autowired
    private ProductoService productoService;

    @Test
    public void testearSuma(){

        int esperado = 4;

        int resultado = productoService.sumarNumeros(1,3);

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testCrearProducto(){



    }

    @Test
    public void testActualizarStock() {
        ProductoService productoService = new ProductoService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        productoService.actualizarStock(producto, 20);
        assertEquals(20, producto.getStock());
    }

    @Test
    public void testConsultarStock() {
        ProductoService productoService = new ProductoService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        Optional<Integer> stock = productoService.consultarStock(producto);
        assertTrue(stock.isPresent());
        assertEquals(10, stock.get().intValue());
    }

    @Test
    public void testMarcarProductoComoBaja() {
        ProductoService productoService = new ProductoService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        productoService.marcarProductoComoBaja(producto);
        assertEquals(LocalDate.now(), producto.getFechaHoraBaja());
    }
}
