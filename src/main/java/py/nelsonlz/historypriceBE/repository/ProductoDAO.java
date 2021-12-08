package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Producto;

public interface ProductoDAO extends JpaRepository<Producto, Integer> {
}