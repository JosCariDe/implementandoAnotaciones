package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartidaRepositorio extends JpaRepository<Partida,Long> {
    // Encontrar una partida por su ID
    List<Partida> findByIdPartida(Integer idPartida);

    // Guardar una partida (Crear o Actualizar)
    Partida save(Partida partida);

    // Eliminar una partida por su ID
    void deleteByIdPartida(Integer idPartida);

    // Listar todas las partidas
    List<Partida> findAll();

}
