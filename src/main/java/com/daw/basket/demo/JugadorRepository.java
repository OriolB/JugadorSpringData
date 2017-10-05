package com.daw.basket.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador, Long> {

    List<Jugador>findByNombre(String nombre);

    List<Jugador>findByNumCanastasGreaterThanEqual(Integer numCanastas);

    List<Jugador>findByNumCanastasBetween(Integer min, Integer max);

    List<Jugador>findByNumAsistenciasBetween(Integer min, Integer max);

    List<Jugador>findByPosicion(String posicion);

    List<Jugador>findByFechaNacimientoBefore(LocalDate fechaNacimiento);

    @Query("select new com.daw.basket.demo.EstadisticasPosicion (j.posicion, avg(j.numCanastas), avg(j.numRebotes), avg(j.numAsistencias)) " +
           "from Jugador j group by j.posicion")
    List<EstadisticasPosicion> AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion();

    @Query("select new com.daw.basket.demo.EstadisticasPosicion (j.posicion, avg(j.numCanastas), max(j.numCanastas), min(j.numCanastas), " +
            "avg(j.numRebotes), max(j.numRebotes), min(j.numRebotes), avg(j.numAsistencias), max(j.numAsistencias), min(j.numAsistencias)) " +
            "from Jugador j group by j.posicion")
    List<EstadisticasPosicion> AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion2();

//    List<EstadisticasPosicion> EstadisticasCompletas();

    List<Jugador> findByEquipo(Equipo equipo);

    List<Jugador> findByEquipoNombre(String nombre);

    List<Jugador> findByEquipoNombreAndPosicion(String nombre, String posicion);

    Jugador findTopByEquipoNombreOrderByNumCanastasDesc(String nombreEquipo);

}




