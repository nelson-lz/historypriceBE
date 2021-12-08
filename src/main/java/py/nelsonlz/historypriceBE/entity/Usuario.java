package py.nelsonlz.historypriceBE.entity;

import py.nelsonlz.historypriceBE.entity.Ciudad;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private long id;

    @Lob
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Lob
    @Column(name = "email", nullable = false)
    private String email;

    @Lob
    @Column(name = "pass", nullable = false)
    private String pass;

    @Column(name = "permisos", nullable = false)
    private Integer permisos;

    @ManyToOne
    @JoinColumn(name = "ciudad")
    private Ciudad ciudad;

    @Column(name = "create_at")
    private Instant createAt;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String pass, Integer permisos, Ciudad ciudad, Instant createAt){
        this.nombre = nombre;
        this.email = email;
        this.pass = pass;
        this.permisos = permisos;
        this.ciudad = ciudad;
        this.createAt = createAt;
    }

    public Instant getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Instant createAt) {
        this.createAt = createAt;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getPermisos() {
        return permisos;
    }

    public void setPermisos(Integer permisos) {
        this.permisos = permisos;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}