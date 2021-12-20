package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Ciudad;
import py.nelsonlz.historypriceBE.repository.CiudadDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class CiudadDTOTest {
    static final Integer ID =1;
    @Autowired
    CiudadDAO dao;
    Ciudad ciudad = new Ciudad();
    CiudadDTO ciuDto;

    @BeforeEach
    void init(){
        ciudad = dao.findById(ID).get();
        log.info(ciudad.getDescripcion());
        ciuDto= new CiudadDTO(ciudad);
        log.info(ciuDto.toString());
    }

    @Test
    void checkConvertionEntityInDto(){
        assertEquals(ciudad.getDescripcion(),ciuDto.getDescripcion());
    }
}
