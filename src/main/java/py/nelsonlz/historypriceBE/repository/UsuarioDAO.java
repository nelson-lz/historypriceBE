package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
}