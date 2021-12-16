package py.nelsonlz.historypriceBE.dto;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import py.nelsonlz.historypriceBE.entity.Cotizacion;
import py.nelsonlz.historypriceBE.repository.CotizacionDAO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Log4j2
@SpringBootTest
public class CotizacionDTOTest {
    @Autowired
    private CotizacionDAO dao;
    private Cotizacion cotizacion = new Cotizacion();
    private CotizacionDTO dto;
    private static final int ID = 1;

    @BeforeEach
    void init(){
        cotizacion = dao.findById(ID).get();
        dto = new CotizacionDTO(cotizacion);
    }

    @Test
    void converEntityToDto(){
        assertEquals(cotizacion.getCreateAt(),dto.getCreateAt());
    }
}
