package py.nelsonlz.historypriceBE.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import py.nelsonlz.historypriceBE.entity.Ciudad;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@WebMvcTest(CiudadService.class)
class CiudadServiceTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private CiudadService ciudadService;
    private List<Ciudad> list = new ArrayList<>();
    @BeforeEach
    void setUp() {
        list.add(new Ciudad(1, "HolaMundo", "xxx", Instant.now()));
        Mockito.when(ciudadService.findByDescripcion("hola")).thenReturn(list);
        Mockito.when(ciudadService.count()).thenReturn((long)1);
    }

    @Test
    void findByDescripcion() {
        assertNotNull(ciudadService.findByDescripcion("hola"));
    }

    @Test
    void findByDescripcionContainingIgnoreCase() {
        assertNotNull(ciudadService.findByDescripcion("hola"));
    }

    @Test
    void findAll() {
    }

    @Test
    void count() {
        log.info(String.format("Count() de ciudadService=%d", ciudadService.count()));
        assertEquals(1, ciudadService.count());
    }
}