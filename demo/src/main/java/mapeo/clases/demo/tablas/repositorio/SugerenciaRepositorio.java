package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Partida;
import mapeo.clases.demo.tablas.Sugerencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SugerenciaRepositorio extends JpaRepository<Sugerencia,Long> {
    //List<Sugerencia> findByIdSugerencia(Long id);
    //List<Sugerencia> deleteByIdSugerencia(Long id);

    Sugerencia save(Sugerencia partida);

    List<Sugerencia> findAll();

}
