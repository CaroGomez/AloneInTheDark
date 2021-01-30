package co.udea.thedivines.serviciosalud.models.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pacientes")
public class Paciente  implements Serializable {

    @Id
    private Long id;
    @Column
    private String tipoIdentificacion;
    @Column
    private String nombre;
    @Column
    private Long numeroContacto;
    @Column
    private String feNa;
    @Column
    private String EPS;

    public Paciente(){
        super();
    }

    public Paciente(Long id, String tipoIdentificacion, String nombre, String apellido, int edad, Long numeroContacto, String feNa, String EPS, String RH){
        this.id = id;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombre = nombre;
        this.numeroContacto = numeroContacto;
        this.feNa = feNa;
        this.EPS = EPS;
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }


    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(Long numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    public String getFeNa() {
        return feNa;
    }

    public void setFeNa(String feNa) {
        this.feNa = feNa;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

}
