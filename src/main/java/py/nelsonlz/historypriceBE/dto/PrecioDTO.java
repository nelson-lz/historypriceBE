package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Data
public class PrecioDTO implements Serializable {
    private final long id;
    private final Tienda tienda;
    private final Usuario usuario;
    private final Instant fecha;
    private final Cotizacion cotizacion;
    private final UnidadMedida unidadMedida;
    private final Double cantidad;
    private final BigDecimal precioPy;
    private final BigDecimal precioUs;
    private final BigDecimal precioBr;
    private final BigDecimal precioAr;
    private final Producto producto;

    public PrecioDTO(Precio pre){
        this.id = pre.getId();
        this.tienda = pre.getTienda();
        this.usuario = pre.getUsuario();
        this.fecha = pre.getFecha();
        this.cotizacion = pre.getCotizacion();
        this.unidadMedida = pre.getUnidadMedida();
        this.cantidad = pre.getCantidad();
        this.precioPy = pre.getPrecioPy();
        this.precioUs = pre.getPrecioUs();
        this.precioBr = pre.getPrecioBr();
        this.precioAr = pre.getPrecioAr();
        this.producto = pre.getProducto();
    }
}
