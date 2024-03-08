package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioRepositorio extends JpaRepository<Usuario , Long> {

    Usuario save(Usuario usuario);
    List<Usuario> findByUsernameUsuarioOrEmailUsuario(String username, String email);

    void deleteByIdUsuario(Integer idUsuario);

    // Listar todos los usuarios
    List<Usuario> findAll();

}
