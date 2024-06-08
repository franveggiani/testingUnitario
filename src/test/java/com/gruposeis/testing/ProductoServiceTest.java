package com.gruposeis.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductoServiceTest {
    @Autowired
    private ProductoService productoService;
    @Test
    public void testCrearProducto(){

        Producto esperado = new Producto(1L, "Palo de escoba", 5);

        Producto resultado = productoService.crearProducto(1L, "Palo de escoba", 5);

        Assertions.assertEquals(esperado, resultado);
    }

}
