package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepositorio extends JpaRepository<Mensaje, Long> {

}
