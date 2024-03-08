package mapeo.clases.demo.tablas;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long idUsuario;
    @Column(unique = true, nullable = false)
    private String usernameUsuario;
    @Column(unique = true)
    private String emailUsuario;
    private String nombresUsuario;
    private String apellidosUsuario;
    private Integer edadUsuario;
    private String  passwordUsuario;
    private String repPasswordUsuario;
    private Boolean enabledUsuario;
    private String fotoUsuario;
    private String rolUsuario;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime ceateAtUsuario;

    @OneToMany(mappedBy = "idMensaje", fetch = FetchType.EAGER)
    private List<Mensaje> mensajesUsuario;

    @OneToMany(mappedBy = "idSugerencia", fetch = FetchType.EAGER)
    private List<Sugerencia> sugerenciasUsuario;

    @JoinTable(
            name = "usuarios_partida", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"),
            inverseJoinColumns = @JoinColumn(name = "id_partida", referencedColumnName = "idPartida")
    )
    private List<Partida> partidasUsuario;



}
