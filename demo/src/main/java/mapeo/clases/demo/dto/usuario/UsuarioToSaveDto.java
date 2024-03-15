package mapeo.clases.demo.dto.usuario;

public record UsuarioToSaveDto(Long id,
                               String nombre,
                               String apellido,
                               String username,
                               String password,
                               String email) {
}
