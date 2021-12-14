package py.nelsonlz.historypriceBE.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "marca")
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Lob
    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    @Lob
    @Column(name = "img")
    private String img;

    @Column(name = "create_at")
    private Instant createAt;

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}