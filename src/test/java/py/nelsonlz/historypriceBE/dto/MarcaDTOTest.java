package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Marca;
import py.nelsonlz.historypriceBE.repository.MarcaDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class MarcaDTOTest {
    @Autowired
    private MarcaDAO dao;
    private Marca marca = new Marca();
    private MarcaDTO marDto;
    private static final Integer ID = 1;
    @BeforeEach
    void init(){
        marca = dao.findById(ID).get();
        marDto = new MarcaDTO(marca);
    }

    @Test
    void convertMarcaInDTO(){
        assertEquals(marca.getDescripcion(),marDto.getDescripcion());
    }

}
