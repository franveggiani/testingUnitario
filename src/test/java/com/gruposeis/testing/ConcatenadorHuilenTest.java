package com.gruposeis.testing;

import concatenador.Concatenador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ConcatenadorHuilenTest {
    private Concatenador concatenador;

    @Test
    public void validarNombreClaseConcatenador(){
        Concatenador concatenador = new Concatenador();

        assertNotNull(concatenador);
    }

    @Test
    public void validarDefinicionMetodoConcatenar(){
        String resultado = Concatenador.concatenar("HOLA ", "MUNDO!");
        Concatenador concatenador = new Concatenador();

        assertEquals(resultado, "HOLA MUNDO!");
    }

    @Test
    public void validarDefinicionMetodoDuplicarFrase(){
        String resultado = Concatenador.duplicarFrase("Hola!");
        Concatenador concatenador = new Concatenador();

        assertEquals(resultado, "Hola!Hola!");
    }
}
