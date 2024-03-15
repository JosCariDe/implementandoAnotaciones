package mapeo.clases.demo.dto.mensaje;

import java.time.LocalDateTime;

public record MensajeToSaveDto(Long id,
                               String creador,
                               String destinario,
                               String contenido,
                               LocalDateTime createAt) {
}
