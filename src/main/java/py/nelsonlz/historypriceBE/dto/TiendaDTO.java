package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.Ciudad;
import py.nelsonlz.historypriceBE.entity.Tienda;

import java.io.Serializable;
import java.time.Instant;

@Data
public class TiendaDTO implements Serializable {
    private final long id;
    private final String descripcion;
    private final String ubicacionGps;
    private final Ciudad ciudad;
    private final String img1;
    private final String img2;
    private final Instant createAt;

    public TiendaDTO(Tienda ti){
        this.id = ti.getId();
        this.descripcion = ti.getDescripcion();
        this.ubicacionGps = ti.getUbicacionGps();
        this.ciudad = ti.getCiudad();
        this.img1 = ti.getImg1();
        this.img2 = ti.getImg2();
        this.createAt = ti.getCreateAt();
    }
}
