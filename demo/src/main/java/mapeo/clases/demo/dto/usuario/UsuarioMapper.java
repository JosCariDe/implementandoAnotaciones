package mapeo.clases.demo.dto.usuario;

import mapeo.clases.demo.dto.sugerencia.SugerenciaDto;
import mapeo.clases.demo.tablas.Sugerencia;
import mapeo.clases.demo.tablas.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {
    //UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "username", target = "username"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "apellido", target = "apellido"),
            @Mapping(source = "nombre", target = "nombre"),
            @Mapping(target = "sugerencias", source = "sugerencias"),
            @Mapping(target = "mensajes", source = "mensajes"),
            @Mapping(target = "partidas", source = "partidas")
    })
    UsuarioDto usuarioToUsuarioDto(Usuario usuario);

    Usuario usuarioSaveDtoToUsuarioEntity(UsuarioToSaveDto usuarioDto);

    List<UsuarioDto> usuariosToUsuarioDtos(List<Usuario> usuarios);




}
