package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Marca;

public interface MarcaDAO extends JpaRepository<Marca, Integer> {
}