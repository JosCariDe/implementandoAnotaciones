package mapeo.clases.demo.tablas;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;

@Entity
public class Mensaje {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @JoinColumn(name="id_mensaje")
    private Long idMensaje;
    private Character creadorMensaje;
    private Character destinarioMensaje;
    private LocalDateTime createAtMensaje;
    private Character contenidoMensaje;

    public Mensaje() {
    }

    public Mensaje(Long idMensaje, Character creadorMensaje, Character destinarioMensaje, LocalDateTime createAtMensaje, Character contenidoMensaje) {
        this.idMensaje = idMensaje;
        this.creadorMensaje = creadorMensaje;
        this.destinarioMensaje = destinarioMensaje;
        this.createAtMensaje = createAtMensaje;
        this.contenidoMensaje = contenidoMensaje;
    }

    public Long getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(Long idMensaje) {
        this.idMensaje = idMensaje;
    }

    public Character getCreadorMensaje() {
        return creadorMensaje;
    }

    public void setCreadorMensaje(Character creadorMensaje) {
        this.creadorMensaje = creadorMensaje;
    }

    public Character getDestinarioMensaje() {
        return destinarioMensaje;
    }

    public void setDestinarioMensaje(Character destinarioMensaje) {
        this.destinarioMensaje = destinarioMensaje;
    }

    public LocalDateTime getCreateAtMensaje() {
        return createAtMensaje;
    }

    public void setCreateAtMensaje(LocalDateTime createAtMensaje) {
        this.createAtMensaje = createAtMensaje;
    }

    public Character getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(Character contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }
}
