package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Ciudad;

import java.util.List;

public interface CiudadDAO extends JpaRepository<Ciudad, Integer> {
    List<Ciudad> findByDescripcion(String descripcion);
}