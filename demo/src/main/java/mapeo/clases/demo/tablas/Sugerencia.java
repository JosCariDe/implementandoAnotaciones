package mapeo.clases.demo.tablas;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Sugerencia {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @JoinColumn(name="id_sugerencia")
    private Long idSugerencia;
    private Character descripcionSugerencia;
    private LocalDateTime createAtSugerencia;

    public Sugerencia() {
    }

    public Sugerencia(Long idSugerencia, Character descripcionSugerencia, LocalDateTime createAtSugerencia) {
        this.idSugerencia = idSugerencia;
        this.descripcionSugerencia = descripcionSugerencia;
        this.createAtSugerencia = createAtSugerencia;
    }

    public Long getIdSugerencia() {
        return idSugerencia;
    }

    public void setIdSugerencia(Long idSugerencia) {
        this.idSugerencia = idSugerencia;
    }

    public Character getDescripcionSugerencia() {
        return descripcionSugerencia;
    }

    public void setDescripcionSugerencia(Character descripcionSugerencia) {
        this.descripcionSugerencia = descripcionSugerencia;
    }

    public LocalDateTime getCreateAtSugerencia() {
        return createAtSugerencia;
    }

    public void setCreateAtSugerencia(LocalDateTime createAtSugerencia) {
        this.createAtSugerencia = createAtSugerencia;
    }
}
