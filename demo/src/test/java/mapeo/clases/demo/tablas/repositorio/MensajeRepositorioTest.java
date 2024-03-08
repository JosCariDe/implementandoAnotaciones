package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Mensaje;
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

    @Autowired
    public MensajeRepositorioTest(MensajeRepositorio mensajeRepository) {
        this.mensajeRepositorio = mensajeRepository;
    }

    void initMockMensajes(){
        // Inicializa tus mensajes aquí
    }

    @BeforeEach
    void setUp() {
        // Limpia la base de datos antes de cada prueba
        mensajeRepositorio.deleteAll();
    }

    @Test
    void givenMensaje_whenSave_thenMensajeWithId(){
        //given
        Mensaje mensaje = Mensaje.builder()
                .creadorMensaje("Creador")
                .destinarioMensaje("Destinatario")
                .createAtMensaje(LocalDateTime.now())
                .contenidoMensaje("Contenido del mensaje")
                .creadorMensaje("Manuel")
                .build();
        //when
        Mensaje mensajeSaved = mensajeRepositorio.save(mensaje);
        //then
        assertThat(mensajeSaved.getIdMensaje()).isNotNull();
    }

    @Test
    @DisplayName("dado un conjunto de mensajes al buscarlos todos obtenemos la lista de los mensajes en la base de datos")
    void shouldGetAllMensajes(){
        //GIVEN
        // Inicializa y guarda tus mensajes aquí
        //WHEN
        List<Mensaje> mensajes = mensajeRepositorio.findAll();
        //THEN
        assertThat(mensajes).hasSize(1);
    }

    @Test
    void givenMensajes_whenBuscarPorCreador_thenObtienesUnaListaDeMensajes(){
        //GIVEN
        // Inicializa y guarda tus mensajes aquí
        //WHEN
        List<Mensaje> mensajes = mensajeRepositorio.findByCreadorMensaje("Manuel");
        //THEN
        assertThat(mensajes).isNotEmpty();
        assertThat(mensajes).first().hasFieldOrPropertyWithValue("creadorMensaje",1);
    }

}