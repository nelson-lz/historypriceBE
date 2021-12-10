package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Tienda;

@Repository
public interface TiendaDAO extends JpaRepository<Tienda, Integer> {
}