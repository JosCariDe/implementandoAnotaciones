package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario , Long> {
}
