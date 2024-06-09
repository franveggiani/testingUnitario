package com.gruposeis.testing;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EsPalindromoOrtizServiceTest {
    private EsPalindromoService esPalindromoService;

    @Test
    void validarNombreClasePalindromoService(){
        EsPalindromoService esPalindromo = new EsPalindromoService() ;
        assertNotNull(esPalindromo);
    };
    @Test
    void esPalindromoCuandoNombreEsPalindromo(){
        EsPalindromoService esPalindromoService = new EsPalindromoService();
        String nombrePalindromo = "Hannah";
        boolean resultado = esPalindromoService.esPalindromo(nombrePalindromo);
        assertTrue(resultado);
    }
    @Test
    void esNumeroPalindromo(){
        EsPalindromoService esPalindromoService = new EsPalindromoService();
        int numeroPalindromo = 23442;
        boolean resultado = esPalindromoService.esNumeroPalindromo(numeroPalindromo);
        assertFalse(resultado);
    }
}