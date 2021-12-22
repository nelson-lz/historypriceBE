package py.nelsonlz.historypriceBE.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import py.nelsonlz.historypriceBE.entity.Ciudad;
import py.nelsonlz.historypriceBE.service.CiudadService;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CiudadController.class)
class CiudadControllerITest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CiudadService ciuSrv;

    private List<Ciudad> list = new ArrayList<>();
    @BeforeEach
    void setUp() {
        list.add(new Ciudad(1, "xD", "xxx", Instant.now()));
        list.add(new Ciudad(2, "HolaWeb", "yyy", Instant.now()));
    }

    @Test
    void readAllCiudades() throws Exception {
        when(ciuSrv.findAll()).thenReturn(list);
        mockMvc.perform(get("/api/ciudad/getAll"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(2));
        verify(ciuSrv).findAll();
    }

    @Test
    void getCiudadByDescripcion() throws Exception {
        list.remove(0);//solo queda el item buscado en el mock
        when(ciuSrv.findByDescripcionContainingIgnoreCase("hola")).thenReturn((list));
        mockMvc.perform(get("/api/ciudad/hola"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.size()").value(1));
    }
}