package py.nelsonlz.historypriceBE.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class UsuarioDTO implements Serializable {
    private final long id;
    private final String nombre;
    private final String email;
    private final Integer permisos;
    //private final CiudadDTO ciudad;
    private final Instant createAt;

    public UsuarioDTO(long id, String nombre, String email, Integer permisos, Instant createAt) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.permisos = permisos;
        this.createAt = createAt;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPermisos() {
        return permisos;
    }

//    public CiudadDTO getCiudad() {
//        return ciudad;
//    }

    public Instant getCreateAt() {
        return createAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioDTO entity = (UsuarioDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.nombre, entity.nombre) &&
                Objects.equals(this.email, entity.email) &&
                Objects.equals(this.permisos, entity.permisos) &&
                Objects.equals(this.createAt, entity.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email, permisos, createAt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "nombre = " + nombre + ", " +
                "email = " + email + ", " +
                "permisos = " + permisos + ", " +
 //               "ciudad = " + ciudad + ", " +
                "createAt = " + createAt + ")";
    }
}
