package com.gruposeis.testing;

import java.io.Serializable;
import java.time.LocalDate;

public class Producto implements Serializable {

    public Producto(Long id, String nombre, int stock){
        this.stock = stock;
        this.nombre = nombre;
        this.id = id;
    }

    public Producto(){

    }

    private Long id;
    private String nombre;
    private int stock;
    private LocalDate fechaHoraBaja;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setFechaHoraBaja(LocalDate fechaHoraBaja) {
        this.fechaHoraBaja = fechaHoraBaja;
    }

    public String getNombre() {
        return nombre;
    }
    public int getStock() {
        return stock;
    }
    public LocalDate getFechaHoraBaja() {
        return fechaHoraBaja;
    }

    public void incrementarStock(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
        }
    }

    public void decrementarStock(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock -= cantidad;
        }
    }

    public void marcarComoBaja() {
        this.fechaHoraBaja = LocalDate.now();
    }
}
