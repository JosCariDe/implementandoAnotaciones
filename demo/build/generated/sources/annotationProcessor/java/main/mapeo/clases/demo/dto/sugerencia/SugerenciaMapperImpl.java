package mapeo.clases.demo.dto.sugerencia;

import java.time.LocalDateTime;
import javax.annotation.processing.Generated;
import mapeo.clases.demo.tablas.Sugerencia;
import mapeo.clases.demo.tablas.Usuario;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-15T13:55:41-0500",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.5.jar, environment: Java 17.0.8 (Oracle Corporation)"
)
@Component
public class SugerenciaMapperImpl implements SugerenciaMapper {

    @Override
    public SugerenciaDto sugerenciaToSugerenciaDto(Sugerencia sugerencia) {
        if ( sugerencia == null ) {
            return null;
        }

        Long id = null;
        String descripcion = null;
        Usuario usuario = null;
        LocalDateTime createdAt = null;

        id = sugerencia.getId();
        descripcion = sugerencia.getDescripcion();
        usuario = sugerencia.getUsuarios();
        createdAt = sugerencia.getCreatedAt();

        SugerenciaDto sugerenciaDto = new SugerenciaDto( id, descripcion, createdAt, usuario );

        return sugerenciaDto;
    }

    @Override
    public Sugerencia sugerenciaSaveDetoToSugerenciaEntity(SugerenciaDto sugerenciaDto) {
        if ( sugerenciaDto == null ) {
            return null;
        }

        Sugerencia.SugerenciaBuilder sugerencia = Sugerencia.builder();

        sugerencia.id( sugerenciaDto.id() );
        sugerencia.descripcion( sugerenciaDto.descripcion() );
        sugerencia.createdAt( sugerenciaDto.createdAt() );

        return sugerencia.build();
    }
}
