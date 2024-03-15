package mapeo.clases.demo.dto.partida;

import mapeo.clases.demo.tablas.Usuario;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public record PartidaToSaveDto(Long id,
                               String creador,
                               String ciudad,
                               String deporte,
                               String provincia,
                               LocalDateTime fecha,
                               LocalTime horaComienzo,
                               LocalTime horaFInal,
                               Integer participantes,
                               Integer suplentes,
                               String comentarios) {
}
