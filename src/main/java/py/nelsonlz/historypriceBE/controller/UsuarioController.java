package py.nelsonlz.historypriceBE.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import py.nelsonlz.historypriceBE.dto.UsuarioDTO;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.service.UsuarioService;


import java.util.List;

@RestController
@RequestMapping(UsuarioController.RAIZ)
@Api(value = "API Rest Usuarios")
public class UsuarioController {
    public static final String RAIZ = "/api";
    public static final String USUARIO = "/user";
    public static final String USUARIOS = "/users";
    public static final String ONEUSER = "/{id}";
    public static final String LOGIN = "/login";

    @Autowired
    private UsuarioService userServ;

    @GetMapping(value = USUARIO + USUARIOS)
    @ApiOperation(value = "Get list of all users")
    public List<UsuarioDTO> getAllUsers(){
        return userServ.getAllUsers();
    }

    @GetMapping(value = USUARIO + ONEUSER)
    @ApiOperation(value = "Get one user by ID")
    public UsuarioDTO getUserId(@PathVariable int id){
        return userServ.getUserById(id);
    }

    @PostMapping(value = USUARIO + LOGIN)
    @ApiOperation(value = "End point for authenticate the user")
    public UsuarioDTO login(@RequestBody Usuario usuario){
        return userServ.login(usuario);
    }
}
