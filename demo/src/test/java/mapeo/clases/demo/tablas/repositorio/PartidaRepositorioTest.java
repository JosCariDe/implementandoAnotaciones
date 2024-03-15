package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Partida;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class PartidaRepositorioTest extends AbstractIntegrationDBTest{

    @Autowired
    private PartidaRepositorio partidaRepositorio;

    @BeforeEach
    void setUp() {
        partidaRepositorio.deleteAll();
    }

    @Test
    @DisplayName("dada una partida al guardarla se asigna un ID")
    void dadoPartidaAlGuardar_entoncesPartidaConId() {
        // GIVEN
        Partida partida = Partida.builder()
                .creador("Juan Pérez")
                .deporte("Fútbol")
                .ciudad("Bogotá")
                .provincia("Cundinamarca")
                .participantes(10)
                .suplentes(5)
                .comentarios("Partido amistoso")
                .build();

        // WHEN
        Partida partidaGuardada = partidaRepositorio.save(partida);

        // THEN
        assertThat(partidaGuardada.getId()).isNotNull();
    }

    @Test
    @DisplayName("dado un conjunto de partidas al buscarlas todas obtenemos la lista de las partidas en la base de datos")
    void deberiaObtenerTodasLasPartidas() {
        // GIVEN
        Partida partida1 = crearPartidaPrueba("Pedro López", "Fútbol", "Medellín", "Antioquia");
        Partida partida2 = crearPartidaPrueba("María Gómez", "Baloncesto", "Cali", "Valle del Cauca");

        // WHEN
        List<Partida> partidas = partidaRepositorio.findAll();

        // THEN
        assertThat(partidas).hasSize(2);
    }

    // Método de utilidad para crear una partida de prueba
    private Partida crearPartidaPrueba(String creador, String deporte, String ciudad, String provincia) {
        return Partida.builder()
                .creador(creador)
                .deporte(deporte)
                .ciudad(ciudad)
                .provincia(provincia)
                .participantes(10)
                .suplentes(5)
                .comentarios("Partido amistoso")
                .build();
    }
}