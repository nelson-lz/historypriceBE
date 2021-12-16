package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Producto;
import py.nelsonlz.historypriceBE.repository.ProductoDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class ProductoDTOTest {
    @Autowired
    private ProductoDAO dao;
    private Producto pro = new Producto();
    private ProductoDTO dto;
    private static final int ID = 1;

    @BeforeEach
    void init(){
        pro = dao.findById(ID).get();
        dto = new ProductoDTO(pro);
    }

    @Test
    void convertEntityInDto(){
        assertEquals(pro.getDescripcion(), dto.getDescripcion());
    }
}
