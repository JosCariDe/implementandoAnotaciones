package mapeo.clases.demo.dto.partida;

import mapeo.clases.demo.tablas.Partida;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PartidaMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "creador", target = "creador"),
            @Mapping(source = "deporte", target = "deporte"),
            @Mapping(source = "fecha", target = "fecha"),
            @Mapping(source = "comentarios", target = "comentarios"),
            @Mapping(source = "ciudad", target = "ciudad"),
            @Mapping(source = "provincia", target = "provincia"),
            @Mapping(source = "horaComienzo", target = "horaComienzo"),
            @Mapping(source = "horaFinal", target = "horaFInal"),
            @Mapping(source = "participantes", target = "participantes"),
            @Mapping(source = "suplentes", target = "suplentes"),
            @Mapping(source = "usuarios", target = "usuarios")
    })

    PartidaDto partidaToPartidaDto(Partida partida);

    Partida partidaSaveDtoPartidaEntity(PartidaToSaveDto partidaDto);


}
