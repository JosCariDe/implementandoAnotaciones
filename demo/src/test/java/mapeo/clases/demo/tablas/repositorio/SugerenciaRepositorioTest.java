package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Sugerencia;
import mapeo.clases.demo.tablas.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
class SugerenciaRepositorioTest extends AbstractIntegrationDBTest{

    Usuario usuario = new Usuario();

    @Autowired
    private SugerenciaRepositorio sugerenciaRepositorio;

    @BeforeEach
    void setUp() {
        sugerenciaRepositorio.deleteAll();
    }

    @Test
    @DisplayName("dada una sugerencia al guardarla se asigna un ID")
    void dadoSugerenciaAlGuardar_entoncesSugerenciaConId() {
        // GIVEN
        Sugerencia sugerencia = Sugerencia.builder()
                .descripcion("Agregar una nueva funcionalidad al sistema")
                .usuarios(usuario)
                .build();

        // WHEN
        Sugerencia sugerenciaGuardada = sugerenciaRepositorio.save(sugerencia);

        // THEN
        assertThat(sugerenciaGuardada.getId()).isNotNull();
    }


}