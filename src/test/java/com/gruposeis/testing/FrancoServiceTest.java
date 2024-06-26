package com.gruposeis.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FrancoServiceTest {
    @Autowired
    private FrancoService francoService;

    @Test
    public void testearSuma(){

        int esperado = 4;
        int resultado = francoService.sumarNumeros(1,3);

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testCrearProducto(){

        Producto productoEsperado = new Producto(1L, "Palo de escoba", 5);
        Producto productoResultado = francoService.crearProducto(1L, "Palo de escoba", 5);

        Assertions.assertEquals(productoEsperado.getNombre(), productoResultado.getNombre());
        Assertions.assertEquals(productoEsperado.getStock(), productoResultado.getStock());

    }

    @Test
    public void testCrearMejoresBandasMusicalesDeLaHistoria(){

        BandaMusical bandaResultado = new FrancoService().crearMejoresBandasDeLaHistoria("The Beatles");
        BandaMusical bandaEsperada = new BandaMusical("The Beatles");

        Assertions.assertEquals(bandaEsperada.getNombre(), bandaResultado.getNombre());

    }
}
