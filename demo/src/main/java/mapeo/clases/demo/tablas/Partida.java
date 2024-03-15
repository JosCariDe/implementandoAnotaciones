package mapeo.clases.demo.tablas;

import jakarta.persistence.*;
import lombok.*;


import java.time.LocalDateTime;

import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "partidas")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Partida {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creador;
    private String ciudad;
    private String deporte;
    private String provincia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fecha;
    @Temporal(TemporalType.TIME)
    private LocalTime horaComienzo;
    @Temporal(TemporalType.TIME)
    private LocalTime horaFinal;
    private Integer participantes;
    private Integer suplentes;
    private String comentarios;
    @ManyToMany(mappedBy = "partidas")
    private List<Usuario> usuarios;
}
