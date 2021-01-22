package co.udea.thedivines.serviciosalud.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="personas")
public abstract class Persona  implements Serializable {

    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;
    @Column
    private String tipoIdentificacion;
    @Column
    private String identificacion;
    @Column
    private String nombre;
    @Column
    private String apellido;
    @Column
    private int numeroContacto;
    @Column
    private Date feNa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public Date getFeNa() {
        return feNa;
    }

    public void setFeNa(Date feNa) {
        this.feNa = feNa;
    }

    private static final long serialVersionUID = 1L;
}
