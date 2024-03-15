package mapeo.clases.demo.dto.mensaje;

import mapeo.clases.demo.tablas.Mensaje;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MensajeMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "contenido", target = "contenido"),
            @Mapping(source = "creador", target = "creador"),
            @Mapping(source = "usuario", target = "usuario"),
            @Mapping(source = "destinario", target = "destinario"),
            @Mapping(source = "createAt", target = "createAt")
    })
    MensajeDto mensajeToMensajeDto(Mensaje mensaje);

    Mensaje mensajeSabeDtoToMensajeEntity(MensajeDto mensajeDto);
}
