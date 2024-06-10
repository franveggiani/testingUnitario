package com.gruposeis.testing;

public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;

    public boolean isHabilitado() {
        return Habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        Habilitado = habilitado;
    }

    private boolean Habilitado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}
