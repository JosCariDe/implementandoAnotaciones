package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepositorio extends JpaRepository<Partida,Long> {
}
