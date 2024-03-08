package mapeo.clases.demo.tablas;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sugerencias")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Sugerencia {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idSugerencia;
    private String descripcionSugerencia;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createAtSugerencia;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuarioSugerencia;

}
