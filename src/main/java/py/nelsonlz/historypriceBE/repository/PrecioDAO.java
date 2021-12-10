package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Precio;

@Repository
public interface PrecioDAO extends JpaRepository<Precio, Integer> {
}