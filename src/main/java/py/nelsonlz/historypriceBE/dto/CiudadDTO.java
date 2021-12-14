package py.nelsonlz.historypriceBE.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class CiudadDTO implements Serializable {
    private final long id;
    private final String descripcion;
    private final Instant createAt;

    public CiudadDTO(long id, String descripcion, String departamento, Instant createAt) {
        this.id = id;
        this.descripcion = descripcion + " - " + departamento;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CiudadDTO entity = (CiudadDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.descripcion, entity.descripcion) &&
                Objects.equals(this.createAt, entity.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, createAt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "descripcion = " + descripcion + ", " +
                "createAt = " + createAt + ")";
    }
}
