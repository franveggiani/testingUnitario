package com.gruposeis.testing;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public UsuarioService() {
    }

    public Usuario CrearUsuario(String nombre, String apellido, int edad) throws Exception {
        ValidarDatosUsuario(nombre, apellido, edad);
        return new Usuario(nombre, apellido, edad);
    }

    public Usuario ActualizarDatosUsuario(Usuario usuario, String nombre, String apellido, int edad) throws Exception {
        ValidarDatosUsuario(nombre, apellido, edad);

        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setEdad(edad);
        return usuario;
    }

    public Usuario BajaUsuario(Usuario usuario) throws Exception {
        if (!usuario.isHabilitado()) {
            throw new Exception("El usuario ya ha sido eliminado previamente");
        }

        usuario.setHabilitado(true);
        return usuario;
    }

    private void ValidarDatosUsuario(String nombre, String apellido, int edad) throws Exception {
        ValidarNombreNoVacio(nombre);
        ValidarApellidoNoVacio(apellido);
        ValidarEdad(edad);
    }

    private void ValidarEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("La edad no puede ser negativa");
        }
    }

    private void ValidarNombreNoVacio(String nombre) throws Exception {
        if (nombre == null || nombre.equals("")) {
            throw new Exception("El nombre no puede estar vacio");
        }
    }

    private void ValidarApellidoNoVacio(String apellido) throws Exception {
        if (apellido == null || apellido.equals("")) {
            throw new Exception("El apellido no puede estar vacio");
        }
    }
}