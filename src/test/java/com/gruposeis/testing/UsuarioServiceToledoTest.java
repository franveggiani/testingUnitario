package com.gruposeis.testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UsuarioServiceToledoTest {
    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        usuarioService = new UsuarioService();
    }

    @Test
    void testCrearUsuario() throws Exception {
        Usuario nuevoUsuario = usuarioService.CrearUsuario("Luciano", "Toledo", 24);
        assertEquals("Luciano", nuevoUsuario.getNombre());
        assertEquals("Toledo", nuevoUsuario.getApellido());
        assertEquals(24, nuevoUsuario.getEdad());
        assertTrue(nuevoUsuario.isHabilitado());
    }

    @Test
    void testActualizarDatosUsuario() throws Exception {
        Usuario usuario = new Usuario("Luciano", "toledo", 24);
        Usuario actualizadoUsuario = usuarioService.ActualizarDatosUsuario(usuario, "Cristian", "Suarez", 25);
        assertEquals("Cristian", actualizadoUsuario.getNombre());
        assertEquals("Suarez", actualizadoUsuario.getApellido());
        assertEquals(25, actualizadoUsuario.getEdad());
        assertTrue(usuario.isHabilitado());
    }

    @Test
    void testBajaUsuario() throws Exception {
        Usuario usuario = new Usuario("Luciano", "Toledo", 25);

        Usuario usuarioBaja = usuarioService.BajaUsuario(usuario);
        assertFalse(usuarioBaja.isHabilitado());
    }
}
