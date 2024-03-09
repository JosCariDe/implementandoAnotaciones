package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Mensaje;
import mapeo.clases.demo.tablas.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class MensajeRepositorioTest extends AbstractIntegrationDBTest{

    @Autowired
    private MensajeRepositorio mensajeRepositorio;
    Usuario usuario = new Usuario();

    @Autowired
    public MensajeRepositorioTest(MensajeRepositorio mensajeRepository) {
        this.mensajeRepositorio = mensajeRepository;
    }

    void initMockMensajes(){
        Mensaje mensaje = Mensaje.builder()
                .creador("Creador")
                .destinario("Destinatario")
                .contenido("Contenido del mensaje")
                .creador("Manuel")
                .usuario(usuario)
                .build();
        mensajeRepositorio.save(mensaje);
    }

    @BeforeEach
    void setUp() {
        mensajeRepositorio.deleteAll();
    }

    @Test
    void dadoMensajesAlBuscarPorCreador_entoncesObtenerListaDeMensajes(){
        //given
        Mensaje mensaje = Mensaje.builder()
                .creador("Creador")
                .destinario("Destinatario")
                .contenido("Contenido del mensaje")
                .creador("Manuel")
                .usuario(usuario)
                .build();
        //when
        mensajeRepositorio.save(mensaje);
        //then
        assertThat(mensaje.getId()).isNotNull();
    }

    @Test
    @DisplayName("dado un conjunto de mensajes al buscarlos todos obtenemos la lista de los mensajes en la base de datos")
    void deberiaObtenerTodosLosMensajes(){
        //GIVEN
        // Inicializa y guarda tus mensajes aquí
        //WHEN
        List<Mensaje> mensajes = mensajeRepositorio.findAll();
        //THEN
        assertThat(mensajes).hasSize(1);
    }

    @Test
    void dadoMensajesAlBuscarPorCreador_entoncesObtienesListaDeMensajes(){
        //GIVEN
        // Inicializa y guarda tus mensajes aquí
        //WHEN
        List<Mensaje> mensajes = mensajeRepositorio.findByCreador("Manuel");
        //THEN
        assertThat(mensajes).isNotEmpty();
        assertThat(mensajes).first().hasFieldOrPropertyWithValue("creadorMensaje",1);
    }

}