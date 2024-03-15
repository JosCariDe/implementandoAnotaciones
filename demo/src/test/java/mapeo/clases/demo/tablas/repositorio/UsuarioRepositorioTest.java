package mapeo.clases.demo.tablas.repositorio;

import mapeo.clases.demo.tablas.Usuario;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class UsuarioRepositorioTest extends AbstractIntegrationDBTest{
    UsuarioRepositorio usuarioRepositorio;

    @Autowired
    public UsuarioRepositorioTest(UsuarioRepositorio usuarioRepository) {
        this.usuarioRepositorio = usuarioRepository;
    }

    void initMockUsuarios(){
        Usuario usuario = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Joscari")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario);

        Usuario usuario2 = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Joscari")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario2);
        usuarioRepositorio.flush();
    }


    @BeforeEach
    void setUp() {

        usuarioRepositorio.deleteAll();

    }

    @Test
    void givenAnUser_whenSave_thenUserwithId(){
        //given
        Usuario usuario = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Joscari")
                .password("4545")
                .build();
        //when
        Usuario userSaved = usuarioRepositorio.save(usuario);
        //then
        assertThat(userSaved.getId()).isNotNull();

    }
    @Test
    @DisplayName("dado un conjunto de usuarios al buscarlo todos obtenemos la lista de los usuarios en la base de datos")
    void shouldGetAllUsers(){
        //GIVEN
        Usuario usuario = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Joscari")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario);

        Usuario usuario2 = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Josc")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario2);
        usuarioRepositorio.flush();
        //WHEN
        List<Usuario> usuarios = usuarioRepositorio.findAll();

        //THEN
        assertThat(usuarios).hasSize(2);
    }
    @Test
    void givenUsuarios_whenBuscarPorNombreyApellido_thenObtienesUnaListaDeUsuarios(){
        Usuario usuario = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Joscari")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario);
        Usuario usuario2 = Usuario.builder()
                .nombre("Jose")
                .apellido("Narvaez")
                .username("Josca")
                .password("4545")
                .build();
        usuarioRepositorio.save(usuario2);

        List<Usuario> usuarios = usuarioRepositorio.findByUsernameOrEmail("Jose", null);

        assertThat(usuarios).isNotEmpty();
        assertThat(usuarios).first().hasFieldOrPropertyWithValue("nombre","Jose");
    }
}