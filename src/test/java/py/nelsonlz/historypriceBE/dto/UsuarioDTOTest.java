package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.repository.UsuarioDAO;

@Log4j2
@SpringBootTest
public class UsuarioDTOTest {
    @Autowired
    UsuarioDAO dao;
    UsuarioDTO usuDto;
    Usuario usuario = new Usuario();
    static final Integer IDENTIFICADOR = 1;

    @BeforeEach
    void init(){
        usuario = dao.findById(IDENTIFICADOR).get();
        usuDto = new UsuarioDTO(usuario.getId(),usuario.getNombre(),usuario.getEmail(),usuario.getPermisos(),usuario.getCreateAt());
        log.info(usuDto.getClass() + " - " + usuario.getClass());
    }

    @Test
    void testUsuarioPorId(){
        Assertions.assertEquals(usuario.getEmail(), usuDto.getEmail());
    }
}
