package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import py.nelsonlz.historypriceBE.entity.Cotizacion;

@Repository
public interface CotizacionDAO extends JpaRepository<Cotizacion, Integer> {
}