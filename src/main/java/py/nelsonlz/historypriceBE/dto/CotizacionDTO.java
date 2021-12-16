package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.Cotizacion;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Data
public class CotizacionDTO implements Serializable {
    private final long id;
    private final Instant fecha;
    private final BigDecimal guarani;
    private final BigDecimal dolar;
    private final BigDecimal realbr;
    private final BigDecimal peso;
    private final Instant createAt;

    public CotizacionDTO(Cotizacion cot){
        this.id = cot.getId();
        this.fecha = cot.getFecha();
        this.guarani = cot.getGuarani();
        this.dolar = cot.getDolar();
        this.realbr = cot.getRealbr();
        this.peso = cot.getPeso();
        this.createAt = cot.getCreateAt();
    }
}
