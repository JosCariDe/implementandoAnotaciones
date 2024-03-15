package mapeo.clases.demo.dto.usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import mapeo.clases.demo.dto.mensaje.MensajeDto;
import mapeo.clases.demo.dto.sugerencia.SugerenciaDto;
import mapeo.clases.demo.tablas.Mensaje;
import mapeo.clases.demo.tablas.Partida;
import mapeo.clases.demo.tablas.Sugerencia;
import mapeo.clases.demo.tablas.Usuario;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-15T13:58:24-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class UsuarioMapperImpl implements UsuarioMapper {

    @Override
    public UsuarioDto usuarioToUsuarioDto(Usuario usuario) {
        if ( usuario == null ) {
            return null;
        }

        Long id = null;
        String username = null;
        String email = null;
        String apellido = null;
        String nombre = null;
        List<SugerenciaDto> sugerencias = null;
        List<MensajeDto> mensajes = null;
        List<Partida> partidas = null;

        id = usuario.getId();
        username = usuario.getUsername();
        email = usuario.getEmail();
        apellido = usuario.getApellido();
        nombre = usuario.getNombre();
        sugerencias = sugerenciaListToSugerenciaDtoList( usuario.getSugerencias() );
        mensajes = mensajeListToMensajeDtoList( usuario.getMensajes() );
        List<Partida> list2 = usuario.getPartidas();
        if ( list2 != null ) {
            partidas = new ArrayList<Partida>( list2 );
        }

        UsuarioDto usuarioDto = new UsuarioDto( id, nombre, apellido, username, email, sugerencias, mensajes, partidas );

        return usuarioDto;
    }

    @Override
    public Usuario usuarioSaveDtoToUsuarioEntity(UsuarioToSaveDto usuarioDto) {
        if ( usuarioDto == null ) {
            return null;
        }

        Usuario.UsuarioBuilder usuario = Usuario.builder();

        usuario.id( usuarioDto.id() );
        usuario.nombre( usuarioDto.nombre() );
        usuario.apellido( usuarioDto.apellido() );
        usuario.username( usuarioDto.username() );
        usuario.password( usuarioDto.password() );
        usuario.email( usuarioDto.email() );

        return usuario.build();
    }

    @Override
    public List<UsuarioDto> usuariosToUsuarioDtos(List<Usuario> usuarios) {
        if ( usuarios == null ) {
            return null;
        }

        List<UsuarioDto> list = new ArrayList<UsuarioDto>( usuarios.size() );
        for ( Usuario usuario : usuarios ) {
            list.add( usuarioToUsuarioDto( usuario ) );
        }

        return list;
    }

    protected SugerenciaDto sugerenciaToSugerenciaDto(Sugerencia sugerencia) {
        if ( sugerencia == null ) {
            return null;
        }

        Long id = null;
        String descripcion = null;
        LocalDateTime createdAt = null;

        id = sugerencia.getId();
        descripcion = sugerencia.getDescripcion();
        createdAt = sugerencia.getCreatedAt();

        Usuario usuario = null;

        SugerenciaDto sugerenciaDto = new SugerenciaDto( id, descripcion, createdAt, usuario );

        return sugerenciaDto;
    }

    protected List<SugerenciaDto> sugerenciaListToSugerenciaDtoList(List<Sugerencia> list) {
        if ( list == null ) {
            return null;
        }

        List<SugerenciaDto> list1 = new ArrayList<SugerenciaDto>( list.size() );
        for ( Sugerencia sugerencia : list ) {
            list1.add( sugerenciaToSugerenciaDto( sugerencia ) );
        }

        return list1;
    }

    protected MensajeDto mensajeToMensajeDto(Mensaje mensaje) {
        if ( mensaje == null ) {
            return null;
        }

        Long id = null;
        String creador = null;
        String destinario = null;
        String contenido = null;
        LocalDateTime createAt = null;
        Usuario usuario = null;

        id = mensaje.getId();
        creador = mensaje.getCreador();
        destinario = mensaje.getDestinario();
        contenido = mensaje.getContenido();
        createAt = mensaje.getCreateAt();
        usuario = mensaje.getUsuario();

        MensajeDto mensajeDto = new MensajeDto( id, creador, destinario, contenido, createAt, usuario );

        return mensajeDto;
    }

    protected List<MensajeDto> mensajeListToMensajeDtoList(List<Mensaje> list) {
        if ( list == null ) {
            return null;
        }

        List<MensajeDto> list1 = new ArrayList<MensajeDto>( list.size() );
        for ( Mensaje mensaje : list ) {
            list1.add( mensajeToMensajeDto( mensaje ) );
        }

        return list1;
    }
}
