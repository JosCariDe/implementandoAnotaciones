package mapeo.clases.demo.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "mensajes")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Mensaje {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idMensaje;
    private String creadorMensaje;
    private String destinarioMensaje;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAtMensaje;
    private String contenidoMensaje;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuarioMensaje;

}
