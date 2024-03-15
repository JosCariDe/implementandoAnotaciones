package mapeo.clases.demo.dto.mensaje;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import mapeo.clases.demo.tablas.Mensaje;
import mapeo.clases.demo.tablas.Usuario;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-15T13:55:41-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class MensajeMapperImpl implements MensajeMapper {

    @Override
    public MensajeDto mensajeToMensajeDto(Mensaje mensaje) {
        if ( mensaje == null ) {
            return null;
        }

        Long id = null;
        String contenido = null;
        String creador = null;
        Usuario usuario = null;
        String destinario = null;
        LocalDateTime createAt = null;

        id = mensaje.getId();
        contenido = mensaje.getContenido();
        creador = mensaje.getCreador();
        usuario = mensaje.getUsuario();
        destinario = mensaje.getDestinario();
        createAt = mensaje.getCreateAt();

        MensajeDto mensajeDto = new MensajeDto( id, creador, destinario, contenido, createAt, usuario );

        return mensajeDto;
    }

    @Override
    public Mensaje mensajeSabeDtoToMensajeEntity(MensajeDto mensajeDto) {
        if ( mensajeDto == null ) {
            return null;
        }

        Mensaje.MensajeBuilder mensaje = Mensaje.builder();

        mensaje.id( mensajeDto.id() );
        mensaje.creador( mensajeDto.creador() );
        mensaje.destinario( mensajeDto.destinario() );
        mensaje.contenido( mensajeDto.contenido() );
        mensaje.createAt( mensajeDto.createAt() );
        mensaje.usuario( mensajeDto.usuario() );

        return mensaje.build();
    }
}
