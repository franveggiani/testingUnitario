package com.gruposeis.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestingNeri {

    @Test
    public void testEsPar_CuandoNumeroEsPar_DebeRetornarTrue() {
        // Arrange (Preparar)
        NeriService neriService = new NeriService();
        // Act (Actuar)
        boolean resultado = neriService.esPar(2);
        // Assert (Afirmar)
        assertTrue(resultado);
    }

    @Test
    public void testEsPersonaAdulta_CuandoEsAdulto_RetornarTrue(){
        // Arrange (Preparar)
        NeriService neriService = new NeriService();
        // Act (Actuar)
        boolean resultado = neriService.esPersonaAdulta(19);
        // Assert (Afirmar)
        assertTrue(resultado);
    }

    @Test
    public void testDuplicar_CuandoNumeroEs5_Retornar10(){
        // Arrange (Preparar)
        int numeroEsperado = 10;
        NeriService neriService = new NeriService();
        // Act (Actuar)
        int resultado = neriService.duplicar(5);
        // Assert (Afirmar)
        Assertions.assertEquals(numeroEsperado, resultado);
    }
}
