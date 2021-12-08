package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.UnidadMedida;

public interface UnidadMedidaDAO extends JpaRepository<UnidadMedida, Integer> {
}