package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Precio;
import py.nelsonlz.historypriceBE.repository.PrecioDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class PrecioDTOTest {
    @Autowired
    private PrecioDAO dao;
    private Precio precio = new Precio();
    private PrecioDTO dto;
    private static final int ID = 1;

    @BeforeEach
    void init(){
        precio = dao.findById(ID).get();
        dto = new PrecioDTO(precio);
    }

    @Test
    void convertEntityInDto(){
        assertEquals(precio.getProducto(), dto.getProducto());
    }
}
