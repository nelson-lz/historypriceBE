package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.repository.UsuarioDAO;

import java.util.Optional;

@Log4j2
@SpringBootTest
public class UsuarioDTOTest {
    @Autowired
    private UsuarioDAO dao;
    private UsuarioDTO usuDto;

    @Test
    void usuarioTestIntegrity(){
        Optional<Usuario> usu = dao.findById(1);
        log.info(usu);
//        usuDto = new UsuarioDTO(usu.get().getId(),usu.get().getNombre(), usu.get().getEmail(), usu.get().getPermisos(), usu.get().getCreateAt() );
        Assertions.assertEquals(usu.get().getEmail(), "ne@ne.es");
    }
}
