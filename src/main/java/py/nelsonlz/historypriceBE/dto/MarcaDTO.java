package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.Marca;
import py.nelsonlz.historypriceBE.repository.MarcaDAO;

import java.io.Serializable;
import java.time.Instant;

@Data
public class MarcaDTO implements Serializable {
    private final long id;
    private final String descripcion;
    private final String img;
    private final Instant createAt;

    public MarcaDTO(Marca marca){
        this.id = marca.getId();
        this.descripcion = marca.getDescripcion();
        this.img = marca.getImg();
        this.createAt = marca.getCreateAt();
    }
}
