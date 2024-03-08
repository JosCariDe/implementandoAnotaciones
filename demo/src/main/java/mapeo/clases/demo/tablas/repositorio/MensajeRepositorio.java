package mapeo.clases.demo.tablas.repositorio;

import jakarta.persistence.criteria.CriteriaBuilder;
import mapeo.clases.demo.tablas.Mensaje;
import mapeo.clases.demo.tablas.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MensajeRepositorio extends JpaRepository<Mensaje, Long> {
    // Encontrar un mensaje por su ID
    List<Mensaje> findByIdMensaje(Integer idMensaje);

    // Guardar un mensaje (Crear o Actualizar)
    Mensaje save(Mensaje mensaje);

    // Eliminar un mensaje por su ID
    void deleteByIdMensaje(Integer idMensaje);

    List<Mensaje> findByCreadorMensaje(String creador);

    // Listar todos los mensajes
    List<Mensaje> findAll();
}
