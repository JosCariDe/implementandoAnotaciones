package mapeo.clases.demo.tablas;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Partida implements Serializable {
    @Id
    private Long idPartida;
    private Character creadorPartida;
    private Character deportePartida;
    private Character ciudadPartida;
    private Character provinciaPartida;
    private LocalDateTime fechaPartida;
    private LocalDateTime horaComienzoPartida;
    private LocalDateTime horaFinalPartida;
    private Integer participantesPartida;
    private Integer suplentesPartida;
    private Character comentariosPartida;
    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinTable(
            name = "estudiante_curso", joinColumns = @JoinColumn(name = "id_partida", referencedColumnName = "id_partida"),
            inverseJoinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    )
    private Collection usuariosPartida;

    public Partida() {
    }

    public Partida(Long idPartida, Character creadorPartida, Character deportePartida, Character ciudadPartida, Character provinciaPartida, LocalDateTime fechaPartida, LocalDateTime horaComienzoPartida, LocalDateTime horaFinalPartida, Integer participantesPartida, Integer suplentesPartida, Character comentariosPartida) {
        this.idPartida = idPartida;
        this.creadorPartida = creadorPartida;
        this.deportePartida = deportePartida;
        this.ciudadPartida = ciudadPartida;
        this.provinciaPartida = provinciaPartida;
        this.fechaPartida = fechaPartida;
        this.horaComienzoPartida = horaComienzoPartida;
        this.horaFinalPartida = horaFinalPartida;
        this.participantesPartida = participantesPartida;
        this.suplentesPartida = suplentesPartida;
        this.comentariosPartida = comentariosPartida;
    }

    public Long getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Long idPartida) {
        this.idPartida = idPartida;
    }

    public Character getCreadorPartida() {
        return creadorPartida;
    }

    public void setCreadorPartida(Character creadorPartida) {
        this.creadorPartida = creadorPartida;
    }

    public Character getDeportePartida() {
        return deportePartida;
    }

    public void setDeportePartida(Character deportePartida) {
        this.deportePartida = deportePartida;
    }

    public Character getCiudadPartida() {
        return ciudadPartida;
    }

    public void setCiudadPartida(Character ciudadPartida) {
        this.ciudadPartida = ciudadPartida;
    }

    public Character getProvinciaPartida() {
        return provinciaPartida;
    }

    public void setProvinciaPartida(Character provinciaPartida) {
        this.provinciaPartida = provinciaPartida;
    }

    public LocalDateTime getFechaPartida() {
        return fechaPartida;
    }

    public void setFechaPartida(LocalDateTime fechaPartida) {
        this.fechaPartida = fechaPartida;
    }

    public LocalDateTime getHoraComienzoPartida() {
        return horaComienzoPartida;
    }

    public void setHoraComienzoPartida(LocalDateTime horaComienzoPartida) {
        this.horaComienzoPartida = horaComienzoPartida;
    }

    public LocalDateTime getHoraFinalPartida() {
        return horaFinalPartida;
    }

    public void setHoraFinalPartida(LocalDateTime horaFinalPartida) {
        this.horaFinalPartida = horaFinalPartida;
    }

    public Integer getParticipantesPartida() {
        return participantesPartida;
    }

    public void setParticipantesPartida(Integer participantesPartida) {
        this.participantesPartida = participantesPartida;
    }

    public Integer getSuplentesPartida() {
        return suplentesPartida;
    }

    public void setSuplentesPartida(Integer suplentesPartida) {
        this.suplentesPartida = suplentesPartida;
    }

    public Character getComentariosPartida() {
        return comentariosPartida;
    }

    public void setComentariosPartida(Character comentariosPartida) {
        this.comentariosPartida = comentariosPartida;
    }
}
