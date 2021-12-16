package py.nelsonlz.historypriceBE.dto;

import lombok.Data;
import py.nelsonlz.historypriceBE.entity.Marca;
import py.nelsonlz.historypriceBE.entity.Producto;

import java.io.Serializable;
import java.time.Instant;

@Data
public class ProductoDTO implements Serializable {
    private final long id;
    private final String descripcion;
    private final String codigoBarras;
    private final Marca marca;
    private final String img1;
    private final String img2;
    private final String img3;
    private final Instant creatAt;
    private final String contenidoNeto;

    public ProductoDTO(Producto pro){
        this.id = pro.getId();
        this.descripcion = pro.getDescripcion();
        this.codigoBarras = pro.getCodigoBarras();
        this.marca = pro.getMarca();
        this.img1 = pro.getImg1();
        this.img2 = pro.getImg2();
        this.img3 = pro.getImg3();
        this.creatAt = pro.getCreatAt();
        this.contenidoNeto = pro.getContenidoNeto();
    }
}
