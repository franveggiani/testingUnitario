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
    public void testearSuma(){

        int esperado = 4;

        int resultado = productoService.sumarNumeros(1,3);

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testCrearProducto(){



    }
}
