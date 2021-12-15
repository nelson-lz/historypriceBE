package py.nelsonlz.historypriceBE.dto;

import py.nelsonlz.historypriceBE.entity.Ciudad;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class CiudadDTO implements Serializable {
    private final long id;
    private final String descripcion;
    private final String departamento;
    private final Instant createAt;

    public CiudadDTO(long id, String descripcion, String departamento, Instant createAt) {
        this.id = id;
        this.descripcion = descripcion;
        this.departamento =  departamento;
        this.createAt = createAt;
    }
    public CiudadDTO(Ciudad ciu){
        this.id = new Long(ciu.getId());
        this.descripcion =  ciu.getDescripcion();
        this.departamento = ciu.getDepartamento();
        this.createAt = ciu.getCreateAt();
    }

    public long getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getDepartamento() {
        return departamento;
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
                Objects.equals(this.departamento, entity.departamento) &&
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
                "descripcion = " + descripcion + ", " + departamento + " " +
                "createAt = " + createAt + ")";
    }
}
