package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Usuario;

public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
}