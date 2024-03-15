package mapeo.clases.demo.dto.usuario;

import mapeo.clases.demo.dto.mensaje.MensajeDto;
import mapeo.clases.demo.dto.sugerencia.SugerenciaDto;
import mapeo.clases.demo.tablas.Partida;

import java.util.Collections;
import java.util.List;

public record UsuarioDto (Long id,
                          String nombre,
                          String apellido,
                          String username,
                          String email,
                          List<SugerenciaDto> sugerencias,
                          List<MensajeDto> mensajes,
                          List<Partida> partidas)
{
    public List<SugerenciaDto> sugerencias(){
        return Collections.unmodifiableList(sugerencias);
    }
    public List<MensajeDto> mensajes(){
        return Collections.unmodifiableList(mensajes);
    }
}
