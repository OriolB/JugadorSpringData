package com.daw.basket.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.time.LocalDate;



@Entity
public class Equipo {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique=true)
    private String nombre;
    private String localidad;
    private LocalDate fechaCreacion;



    public Equipo() {
    }

    public Equipo(String nombre, String localidad, LocalDate fechaCreacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equipo{");
        sb.append("id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", localidad='").append(localidad).append('\'');
        sb.append(", fechaCreacion=").append(fechaCreacion);
        sb.append('}');
        return sb.toString();
    }
}

