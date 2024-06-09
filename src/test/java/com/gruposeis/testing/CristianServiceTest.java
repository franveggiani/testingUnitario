package com.gruposeis.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

@SpringBootTest
public class CristianServiceTest {
    @Test
    public void testActualizarStock() {
        CristianService productoService = new CristianService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        productoService.actualizarStock(producto, 20);
        assertEquals(20, producto.getStock());
    }

    @Test
    public void testConsultarStock() {
        CristianService productoService = new CristianService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        Optional<Integer> stock = productoService.consultarStock(producto);
        assertTrue(stock.isPresent());
        assertEquals(10, stock.get().intValue());
    }

    @Test
    public void testMarcarProductoComoBaja() {
        CristianService productoService = new CristianService();
        Producto producto = new Producto(1L, "Producto 1", 10);
        productoService.marcarProductoComoBaja(producto);
        assertEquals(LocalDate.now(), producto.getFechaHoraBaja());
    }
}
