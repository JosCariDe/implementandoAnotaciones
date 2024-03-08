package mapeo.clases.demo.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
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
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long idPartida;
    private String creadorPartida;
    private String deportePartida;
    private String ciudadPartida;
    private String provinciaPartida;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime fechaPartida;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaComienzoPartida;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime horaFinalPartida;
    private Integer participantesPartida;
    private Integer suplentesPartida;
    private String comentariosPartida;

    @ManyToMany(mappedBy = "partidasUsuario")
    private List<Usuario> usuariosPartida;


}
