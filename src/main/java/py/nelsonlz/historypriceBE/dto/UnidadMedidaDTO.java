package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.UnidadMedida;

import java.io.Serializable;
import java.time.Instant;

@Data
public class UnidadMedidaDTO implements Serializable {
    private final Integer id;
    private final String descripcion;
    private final Instant createAt;
    private final String descri;

    public UnidadMedidaDTO(UnidadMedida um){
        this.id = um.getId();
        this.descripcion = um.getDescripcion();
        this.createAt = um.getCreateAt();
        this.descri = um.getDescri();
    }
}
