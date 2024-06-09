package com.gruposeis.testing;
import org.springframework.stereotype.Service;

@Service
public class EsPalindromoService {
    public boolean esPalindromo(String nombre){
        String nombreSinEspacios = nombre.toLowerCase().replaceAll("\\s+", "");
        // verificar si el nombre es palíndromo
        int longitud = nombreSinEspacios.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (nombreSinEspacios.charAt(i) != nombreSinEspacios.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public boolean esNumeroPalindromo(int numero) {
        String numeroStr = String.valueOf(numero);
        return esPalindromo(numeroStr);
    }
}
