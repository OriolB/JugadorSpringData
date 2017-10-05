package com.daw.basket.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;


    public void testJugador(){

        Jugador ibrahim = new Jugador(
                "Ibrahim",
                LocalDate.of(1991, 1, 9),
                8,
                8,
                8,
                "alero"

        );

        Equipo barça =equipoRepository.findByNombre("FCBarcelona");
        Equipo lleida =equipoRepository.findByNombre("Lleida Basquetbol");
        Equipo girona =equipoRepository.findByNombre("CBGirona");
        Equipo joventut =equipoRepository.findByNombre("Joventut");
        Equipo manresa =equipoRepository.findByNombre("Basquet Manresa");

        ibrahim.setEquipo(barça);

        jugadorRepository.save(ibrahim);

        Jugador oriol = new Jugador(
                "Oriol",
                LocalDate.of(1987, 11, 7),
                6,
                9,
                7,
                "defensa"

        );

        oriol.setEquipo(barça);
        jugadorRepository.save(oriol);

        Jugador david = new Jugador(
                "David",
                LocalDate.of(1994, 4, 24),
                9,
                6,
                4,
                "pibot"

        );

        david.setEquipo(barça);
        jugadorRepository.save(david);


        Jugador arnau = new Jugador(
                "Arnau",
                LocalDate.of(1983, 8, 5),
                2,
                3,
                9,
                "base"

        );
        arnau.setEquipo(barça);
        jugadorRepository.save(arnau);

        Jugador guillem = new Jugador(
                "Guillem",
                LocalDate.of(1988, 6, 18),
                5,
                7,
                7,
                "centro"

        );
        guillem.setEquipo(barça);
        jugadorRepository.save(guillem);

        Jugador toni = new Jugador(
                "Toni",
                LocalDate.of(1996, 11, 29),
                8,
                1,
                1,
                "alero"

        );
        toni.setEquipo(lleida);
        jugadorRepository.save(toni);

        Jugador pere = new Jugador(
                "Pere",
                LocalDate.of(1999, 1, 9),
                5,
                5,
                5,
                "defensa"

        );
        pere.setEquipo(lleida);
        jugadorRepository.save(pere);

        Jugador joan = new Jugador(
                "Joan",
                LocalDate.of(1977, 3, 8),
                2,
                3,
                1,
                "pibot"

        );
        joan.setEquipo(lleida);
        jugadorRepository.save(joan);

        Jugador ramon = new Jugador(
                "Ramon",
                LocalDate.of(1982, 5, 12),
                5,
                3,
                8,
                "base"

        );
        ramon.setEquipo(lleida);
        jugadorRepository.save(ramon);

        Jugador carles = new Jugador(
                "Carles",
                LocalDate.of(1966, 7, 17),
                8,
                2,
                4,
                "centro"

        );
        carles.setEquipo(lleida);
        jugadorRepository.save(carles);


        Jugador francesc = new Jugador(
                "Francesc",
                LocalDate.of(1953, 1, 5),
                2,
                8,
                6,
                "alero"

        );
        francesc.setEquipo(girona);
        jugadorRepository.save(francesc);

        Jugador narcis = new Jugador(
                "Narcis",
                LocalDate.of(1973, 9, 6),
                1,
                2,
                4,
                "defensa"

        );
        narcis.setEquipo(girona);
        jugadorRepository.save(narcis);

        Jugador geroni = new Jugador(
                "Geroni",
                LocalDate.of(1987, 4, 26),
                1,
                2,
                1,
                "pibot"

        );
        geroni.setEquipo(girona);
        jugadorRepository.save(geroni);

        Jugador mateu = new Jugador(
                "Mateu",
                LocalDate.of(1971, 2, 5),
                9,
                6,
                4,
                "base"

        );
        mateu.setEquipo(girona);
        jugadorRepository.save(mateu);

        Jugador roderic = new Jugador(
                "Roderic",
                LocalDate.of(1977, 3, 3),
                1,
                2,
                1,
                "centro"

        );
        roderic.setEquipo(girona);
        jugadorRepository.save(roderic);

        Jugador eugeni = new Jugador(
                "Eugeni",
                LocalDate.of(1953, 1, 5),
                2,
                8,
                6,
                "alero"

        );
        eugeni.setEquipo(joventut);
        jugadorRepository.save(eugeni);

        Jugador enric = new Jugador(
                "Enric",
                LocalDate.of(1973, 9, 6),
                1,
                2,
                4,
                "defensa"

        );
        enric.setEquipo(joventut);
        jugadorRepository.save(enric);

        Jugador jaume = new Jugador(
                "Jaume",
                LocalDate.of(1987, 4, 26),
                1,
                2,
                1,
                "pibot"

        );
        jaume.setEquipo(joventut);
        jugadorRepository.save(jaume);

        Jugador otger = new Jugador(
                "Otger",
                LocalDate.of(1971, 2, 5),
                9,
                6,
                4,
                "base"

        );
        otger.setEquipo(joventut);
        jugadorRepository.save(otger);

        Jugador jofre = new Jugador(
                "Jofre",
                LocalDate.of(1977, 3, 3),
                1,
                2,
                1,
                "centro"

        );
        jofre.setEquipo(joventut);
        jugadorRepository.save(jofre);

        Jugador gilabert= new Jugador(
                "Gilabert",
                LocalDate.of(1953, 1, 5),
                2,
                8,
                6,
                "alero"

        );
        gilabert.setEquipo(manresa);
        jugadorRepository.save(gilabert);

        Jugador alfons = new Jugador(
                "Alfons",
                LocalDate.of(1973, 9, 6),
                1,
                2,
                4,
                "defensa"

        );
        alfons.setEquipo(manresa);
        jugadorRepository.save(alfons);

        Jugador ferran = new Jugador(
                "Ferran",
                LocalDate.of(1987, 4, 26),
                1,
                2,
                1,
                "pibot"

        );
        ferran.setEquipo(manresa);
        jugadorRepository.save(ferran);

        Jugador josep = new Jugador(
                "Josep",
                LocalDate.of(1971, 2, 5),
                9,
                6,
                4,
                "base"

        );
        josep.setEquipo(manresa);
        jugadorRepository.save(josep);

        Jugador ignasi = new Jugador(
                "Ignasi",
                LocalDate.of(1977, 3, 3),
                1,
                2,
                1,
                "centro"

        );
        ignasi.setEquipo(manresa);
        jugadorRepository.save(ignasi);

        System.out.println("jugadorRepository.findByNombre(Oriol)");
        System.out.println(jugadorRepository.findByNombre("Oriol"));
        System.out.println("jugadorRepository.findByNumCanastasGreaterThanEqual(8)");
        System.out.println(jugadorRepository.findByNumCanastasGreaterThanEqual(8));
        System.out.println("jugadorRepository.findByNumAsistenciasBetween(3,8)");
        System.out.println(jugadorRepository.findByNumAsistenciasBetween(3,8));
        System.out.println("jugadorRepository.findByPosicion(\"base\")");
        System.out.println(jugadorRepository.findByPosicion("base"));
        System.out.println("jugadorRepository.findByFechaNacimientoBefore(1900-01-01)");
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1990,01,01)));
        System.out.println("Las Medias");
        System.out.println(jugadorRepository.AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion());
        System.out.println("Estadisticas Completas");
        System.out.println(jugadorRepository.AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion2());
        System.out.println("Equipos por localidad");
        System.out.println(equipoRepository.findByLocalidad("Barcelona"));
        System.out.println("Jugadores por nombre de equipo");
        System.out.println(jugadorRepository.findByEquipoNombre("CBGirona"));
        System.out.println("Jugadores por nombre de equipo y posicion");
        System.out.println(jugadorRepository.findByEquipoNombreAndPosicion("CBGirona", "base"));
        System.out.println("Jugadores de un Equipo con más Canastas");
        System.out.println(jugadorRepository.findTopByEquipoNombreOrderByNumCanastasDesc("CBGirona"));
    }

}
