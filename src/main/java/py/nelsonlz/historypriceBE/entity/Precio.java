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
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tienda", nullable = false)
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "usuario", nullable = false)
    private Usuario usuario;

    @Column(name = "fecha")
    private Instant fecha;

    @ManyToOne
    @JoinColumn(name = "cotizacion", nullable = false)
    private Cotizacion cotizacion;

    @ManyToOne
    @JoinColumn(name = "unidad_medida")
    private UnidadMedida unidadMedida;

    @ManyToOne
    @JoinColumn(name = "producto", nullable = false)
    private Producto producto;

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

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
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

    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Tienda getTienda() {
        return tienda;
    }

    public void setTienda(Tienda tienda) {
        this.tienda = tienda;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}