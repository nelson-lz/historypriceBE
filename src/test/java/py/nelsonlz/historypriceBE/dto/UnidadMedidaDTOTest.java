package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.UnidadMedida;
import py.nelsonlz.historypriceBE.repository.UnidadMedidaDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class UnidadMedidaDTOTest {
    @Autowired
    private UnidadMedidaDAO dao;
    private UnidadMedida um = new UnidadMedida();
    private UnidadMedidaDTO dto;
    private static final int ID = 1;

    @BeforeEach
    void init(){
        um = dao.findById(ID).get();
        dto = new UnidadMedidaDTO(um);
    }

    @Test
    void convertEntityInDto(){
        assertEquals(um.getDescripcion(), dto.getDescripcion());
    }
}
