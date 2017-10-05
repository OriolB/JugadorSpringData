package com.daw.basket.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    public void testEquipo() {

        Equipo barça = new Equipo(
                "FCBarcelona",
                "Barcelona",
                LocalDate.of(1870,1,1)
        );

        equipoRepository.save(barça);

        Equipo lleida = new Equipo(
                "Lleida Basquetbol",
                "Lleida",
                LocalDate.of(1935,2,22)
        );

        equipoRepository.save(lleida);

        Equipo girona = new Equipo(
                "CBGirona",
                "Girona",
                LocalDate.of(1924,8,17)
        );

        equipoRepository.save(girona);

        Equipo joventut = new Equipo(
                "Joventut",
                "Badalona",
                LocalDate.of(1924,8,17)
        );

        equipoRepository.save(joventut);

        Equipo manresa = new Equipo(
                "Basquet Manresa",
                "Manresa",
                LocalDate.of(1924,8,17)
        );

        equipoRepository.save(manresa);



    }
}
