package py.nelsonlz.historypriceBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import py.nelsonlz.historypriceBE.dto.UsuarioDTO;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioController {
    @Autowired
    private UserService userServ;

    @GetMapping("/users")
    public List<UsuarioDTO> getAllUsers(){
        return userServ.getAllUsers();
    }
    @GetMapping("/users/1")
    public String getUserId(){
        return userServ.getUserById(1);
    }
}
