package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.service.UsuarioService;

@Log4j2
@SpringBootTest
public class UsuarioDTOTest {
    @Autowired
    private UsuarioService srv;
    UsuarioDTO usuDto;
    Usuario usuario = new Usuario();
    static final Integer IDENTIFICADOR = 1;

    @BeforeEach
    void init(){
        usuario = srv.findById(IDENTIFICADOR).get();
        usuDto = new UsuarioDTO(usuario.getId(),usuario.getNombre(),usuario.getEmail(),usuario.getPermisos(),usuario.getCreateAt(), usuario.getCiudad());
        log.info(usuDto.getClass() + " - " + usuario.getClass());
    }

    @Test
    void testUsuarioPorId(){
        Assertions.assertEquals(usuario.getEmail(), usuDto.getEmail());
    }
}
