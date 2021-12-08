package py.nelsonlz.historypriceBE.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import py.nelsonlz.historypriceBE.entity.Cotizacion;

public interface CotizacionDAO extends JpaRepository<Cotizacion, Integer> {
}