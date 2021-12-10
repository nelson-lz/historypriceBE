package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Ciudad;

import java.util.List;

@Repository
public interface CiudadDAO extends JpaRepository<Ciudad, Integer> {
    List<Ciudad> findByDescripcion(String descripcion);
}