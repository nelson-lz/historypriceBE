package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Marca;

@Repository
public interface MarcaDAO extends JpaRepository<Marca, Integer> {
}