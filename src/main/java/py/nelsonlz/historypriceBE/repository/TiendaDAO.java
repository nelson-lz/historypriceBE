package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Tienda;

public interface TiendaDAO extends JpaRepository<Tienda, Integer> {
}