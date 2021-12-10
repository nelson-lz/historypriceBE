package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Producto;

@Repository
public interface ProductoDAO extends JpaRepository<Producto, Integer> {
}