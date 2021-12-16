package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Tienda;
import py.nelsonlz.historypriceBE.repository.TiendaDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class TiendaDTOTest {
    @Autowired
    private TiendaDAO dao;
    private Tienda tienda = new Tienda();
    private TiendaDTO dto;
    private static final int ID = 1;

    @BeforeEach
    void init(){
        tienda = dao.findById(ID).get();
        dto = new TiendaDTO(tienda);
    }

    @Test
    void convertEntityInDto(){
        assertEquals(tienda.getDescripcion(), dto.getDescripcion());
    }
}
