package py.nelsonlz.historypriceBE.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import py.nelsonlz.historypriceBE.dto.CiudadDTO;
import py.nelsonlz.historypriceBE.service.CiudadService;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
@RequestMapping(CiudadController.RAIZ)
@Api(value = "API Rest Ciudad")
public class CiudadController {

    public static final String RAIZ = "/api";
    public static final String CIUDAD = "/ciudad";
    public static final String CIUDADES = "/getAll";
    public static final String DESCRIPCION = "/{descripcion}";

    @Autowired
    private CiudadService srv;

    @GetMapping(value = CIUDAD)
    @ApiOperation(value = "Status of endpoint")
    public String read(){
        return "Ok!! :D";
    }

    @GetMapping(value = CIUDAD + CIUDADES)
    @ApiOperation(value = "Get all fields of Ciudades")
    public List<CiudadDTO> readAllCiudades(){
        return srv.findAll().stream().map(CiudadDTO::new).collect(Collectors.toList());
    }

    @GetMapping(value = CIUDAD + DESCRIPCION)
    public List<CiudadDTO> getCiudadByDescripcion(@PathVariable String descripcion){
        List<CiudadDTO> lista = srv.findByDescripcionContainingIgnoreCase(descripcion).stream().map(CiudadDTO::new).collect(Collectors.toList());
        log.info("Tamaño de la lista de ciudad: "+ lista.size());
        return lista;
    }

}
