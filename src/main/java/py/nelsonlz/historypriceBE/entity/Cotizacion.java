package py.nelsonlz.historypriceBE.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "cotizacion")
public class Cotizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "fecha", nullable = false)
    private Instant fecha;

    @Column(name = "guarani", nullable = false, precision = 131089)
    private BigDecimal guarani;

    @Column(name = "dolar", nullable = false, precision = 131089)
    private BigDecimal dolar;

    @Column(name = "realbr", nullable = false, precision = 131089)
    private BigDecimal realbr;

    @Column(name = "peso", nullable = false, precision = 131089)
    private BigDecimal peso;

    @Column(name = "create_at")
    private Instant createAt;

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getRealbr() {
        return realbr;
    }

    public void setRealbr(BigDecimal realbr) {
        this.realbr = realbr;
    }

    public BigDecimal getDolar() {
        return dolar;
    }

    public void setDolar(BigDecimal dolar) {
        this.dolar = dolar;
    }

    public BigDecimal getGuarani() {
        return guarani;
    }

    public void setGuarani(BigDecimal guarani) {
        this.guarani = guarani;
    }

    public Instant getFecha() {
        return fecha;
    }

    public void setFecha(Instant fecha) {
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}