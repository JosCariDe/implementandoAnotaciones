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
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String creador;
    private String destinario;
    private String contenido;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAt;
    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

}
