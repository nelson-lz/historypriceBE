package py.nelsonlz.historypriceBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import py.nelsonlz.historypriceBE.dto.UsuarioDTO;
import py.nelsonlz.historypriceBE.entity.Usuario;
import py.nelsonlz.historypriceBE.repository.UsuarioDAO;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UsuarioDAO usuarioDAO;

    public String getUserById(int i){
        return usuarioDAO.findById(i).get().getNombre();
    }
    public List<UsuarioDTO> getAllUsers(){
        return usuarioDAO.findAll()
                .stream()
                .map(this::convertirEntityToDto)
                .collect(Collectors.toList());
    }

    private UsuarioDTO convertirEntityToDto(Usuario usuario){
        UsuarioDTO usuDto = new UsuarioDTO(new Long(usuario.getId()),usuario.getNombre(), usuario.getEmail(), usuario.getPermisos(), usuario.getCreateAt());
        return usuDto;
    }
}
