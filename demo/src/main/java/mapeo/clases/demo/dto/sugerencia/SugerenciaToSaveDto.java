package mapeo.clases.demo.dto.sugerencia;

import java.time.LocalDateTime;

public record SugerenciaToSaveDto(Long id,
                                  String descripcion,
                                  LocalDateTime createdAt) {
}
