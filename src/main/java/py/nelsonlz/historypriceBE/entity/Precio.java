package py.nelsonlz.historypriceBE.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "precio")
public class Precio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "tienda", nullable = false)
    private Integer tienda;

    @Column(name = "usuario", nullable = false)
    private Integer usuario;

    @Column(name = "fecha")
    private Instant fecha;

    @Column(name = "cotizacion", nullable = false)
    private Integer cotizacion;

    @Column(name = "unidad_medida", nullable = false)
    private Integer unidadMedida;

    @Column(name = "cantidad", nullable = false)
    private Double cantidad;

    @Column(name = "precio_py", precision = 131089)
    private BigDecimal precioPy;

    @Column(name = "precio_us", precision = 131089)
    private BigDecimal precioUs;

    @Column(name = "precio_br", precision = 131089)
    private BigDecimal precioBr;

    @Column(name = "precio_ar", precision = 131089)
    private BigDecimal precioAr;

    @Column(name = "producto", nullable = false)
    private Integer producto;

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public BigDecimal getPrecioAr() {
        return precioAr;
    }

    public void setPrecioAr(BigDecimal precioAr) {
        this.precioAr = precioAr;
    }

    public BigDecimal getPrecioBr() {
        return precioBr;
    }

    public void setPrecioBr(BigDecimal precioBr) {
        this.precioBr = precioBr;
    }

    public BigDecimal getPrecioUs() {
        return precioUs;
    }

    public void setPrecioUs(BigDecimal precioUs) {
        this.precioUs = precioUs;
    }

    public BigDecimal getPrecioPy() {
        return precioPy;
    }

    public void setPrecioPy(BigDecimal precioPy) {
        this.precioPy = precioPy;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(Integer unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Integer getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Integer cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getTienda() {
        return tienda;
    }

    public void setTienda(Integer tienda) {
        this.tienda = tienda;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}