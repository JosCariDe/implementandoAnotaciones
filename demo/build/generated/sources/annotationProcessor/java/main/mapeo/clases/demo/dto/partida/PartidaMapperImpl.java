package mapeo.clases.demo.dto.partida;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import mapeo.clases.demo.tablas.Partida;
import mapeo.clases.demo.tablas.Usuario;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-15T13:55:41-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class PartidaMapperImpl implements PartidaMapper {

    @Override
    public PartidaDto partidaToPartidaDto(Partida partida) {
        if ( partida == null ) {
            return null;
        }

        Long id = null;
        String creador = null;
        String deporte = null;
        LocalDateTime fecha = null;
        String comentarios = null;
        String ciudad = null;
        String provincia = null;
        LocalTime horaComienzo = null;
        LocalTime horaFInal = null;
        Integer participantes = null;
        Integer suplentes = null;
        List<Usuario> usuarios = null;

        id = partida.getId();
        creador = partida.getCreador();
        deporte = partida.getDeporte();
        fecha = partida.getFecha();
        comentarios = partida.getComentarios();
        ciudad = partida.getCiudad();
        provincia = partida.getProvincia();
        horaComienzo = partida.getHoraComienzo();
        horaFInal = partida.getHoraFinal();
        participantes = partida.getParticipantes();
        suplentes = partida.getSuplentes();
        List<Usuario> list = partida.getUsuarios();
        if ( list != null ) {
            usuarios = new ArrayList<Usuario>( list );
        }

        PartidaDto partidaDto = new PartidaDto( id, creador, ciudad, deporte, provincia, fecha, horaComienzo, horaFInal, participantes, suplentes, comentarios, usuarios );

        return partidaDto;
    }

    @Override
    public Partida partidaSaveDtoPartidaEntity(PartidaToSaveDto partidaDto) {
        if ( partidaDto == null ) {
            return null;
        }

        Partida.PartidaBuilder partida = Partida.builder();

        partida.id( partidaDto.id() );
        partida.creador( partidaDto.creador() );
        partida.ciudad( partidaDto.ciudad() );
        partida.deporte( partidaDto.deporte() );
        partida.provincia( partidaDto.provincia() );
        partida.fecha( partidaDto.fecha() );
        partida.horaComienzo( partidaDto.horaComienzo() );
        partida.participantes( partidaDto.participantes() );
        partida.suplentes( partidaDto.suplentes() );
        partida.comentarios( partidaDto.comentarios() );

        return partida.build();
    }
}
