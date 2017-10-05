package com.daw.basket.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EquipoRepository extends JpaRepository<Equipo, Long> {

    Equipo findByNombre(String nombre);

    Equipo findByLocalidad (String localidad);



}