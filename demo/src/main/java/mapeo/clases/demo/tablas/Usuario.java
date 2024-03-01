package mapeo.clases.demo.tablas;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Usuario {
    @Id
    private Long idUsuario;
    private Character usernameUsuario;
    private Character emailUsuario;
    private String nombresUsuario;
    private String apellidosUsuario;
    private Integer edadUsuario;
    private Character passwordUsuario;
    private Character repPasswordUsuario;
    private Boolean enabledUsuario;
    private Character fotoUsuario;
    private Character rolUsuario;
    private LocalDateTime ceateAtUsuario;

    @OneToMany(mappedBy = "id_mensaje", fetch = FetchType.EAGER)
    private Collection<Integer> idMensajes;

    @OneToMany(mappedBy = "id_sugerencia", fetch = FetchType.EAGER)
    private Collection<Integer> idSugerencia;

    @ManyToMany(mappedBy = "usario_partidas")
    private Collection partidasUsuario;

    public Usuario() {
    }

    public Usuario(Long idUsuario, Character usernameUsuario, Character emailUsuario, String nombresUsuario, String apellidosUsuario, Integer edadUsuario, Character passwordUsuario, Character repPasswordUsuario, Boolean enabledUsuario, Character fotoUsuario, Character rolUsuario, LocalDateTime ceateAtUsuario, Collection<Integer> idMensajes, Collection<Integer> idSugerencia) {
        this.idUsuario = idUsuario;
        this.usernameUsuario = usernameUsuario;
        this.emailUsuario = emailUsuario;
        this.nombresUsuario = nombresUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.edadUsuario = edadUsuario;
        this.passwordUsuario = passwordUsuario;
        this.repPasswordUsuario = repPasswordUsuario;
        this.enabledUsuario = enabledUsuario;
        this.fotoUsuario = fotoUsuario;
        this.rolUsuario = rolUsuario;
        this.ceateAtUsuario = ceateAtUsuario;
        this.idMensajes = idMensajes;
        this.idSugerencia = idSugerencia;
    }

    public Collection<Integer> getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(Collection<Integer> idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public Collection<Integer> getIdMensajes() {
        return idMensajes;
    }

    public void setIdMensajes(Collection<Integer> idMensajes) {
        this.idMensajes = idMensajes;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Character getUsernameUsuario() {
        return usernameUsuario;
    }

    public void setUsernameUsuario(Character usernameUsuario) {
        this.usernameUsuario = usernameUsuario;
    }

    public Character getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(Character emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public Integer getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(Integer edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public Character getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(Character passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }

    public Character getRepPasswordUsuario() {
        return repPasswordUsuario;
    }

    public void setRepPasswordUsuario(Character repPasswordUsuario) {
        this.repPasswordUsuario = repPasswordUsuario;
    }

    public Boolean getEnabledUsuario() {
        return enabledUsuario;
    }

    public void setEnabledUsuario(Boolean enabledUsuario) {
        this.enabledUsuario = enabledUsuario;
    }

    public Character getFotoUsuario() {
        return fotoUsuario;
    }

    public void setFotoUsuario(Character fotoUsuario) {
        this.fotoUsuario = fotoUsuario;
    }

    public Character getRolUsuario() {
        return rolUsuario;
    }

    public void setRolUsuario(Character rolUsuario) {
        this.rolUsuario = rolUsuario;
    }

    public LocalDateTime getCeateAtUsuario() {
        return ceateAtUsuario;
    }

    public void setCeateAtUsuario(LocalDateTime ceateAtUsuario) {
        this.ceateAtUsuario = ceateAtUsuario;
    }
}
