package mapeo.clases.demo.dto.sugerencia;

import mapeo.clases.demo.tablas.Usuario;

import java.time.LocalDateTime;

public record SugerenciaDto(Long id,
                            String descripcion,
                            LocalDateTime createdAt,
                            Usuario usuario) {
}
