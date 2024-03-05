package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SugerenciaRepositorio extends JpaRepository<Sugerencia,Long> {
}
