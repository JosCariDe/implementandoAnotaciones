package mapeo.clases.demo.dto.mensaje;

import mapeo.clases.demo.tablas.Usuario;

import java.time.LocalDateTime;

public record MensajeDto(Long id,
                         String creador,
                         String destinario,
                         String contenido,
                         LocalDateTime createAt,
                         Usuario usuario) {
}
