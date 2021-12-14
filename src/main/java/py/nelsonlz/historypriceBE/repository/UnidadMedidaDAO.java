package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.UnidadMedida;

@Repository
public interface UnidadMedidaDAO extends JpaRepository<UnidadMedida, Integer> {
}