package mapeo.clases.demo.dto.sugerencia;

import mapeo.clases.demo.tablas.Sugerencia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface SugerenciaMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "descripcion", target = "descripcion"),
            @Mapping(source = "usuarios", target = "usuario"),
            @Mapping(source = "createdAt", target = "createdAt")
    })
    SugerenciaDto sugerenciaToSugerenciaDto(Sugerencia sugerencia);

    Sugerencia sugerenciaSaveDetoToSugerenciaEntity(SugerenciaDto sugerenciaDto);
}
