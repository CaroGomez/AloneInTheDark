package co.udea.thedivines.serviciosalud.models.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pacientes")
public class Paciente implements Serializable {
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;
    @Column
    private String EPS;
    @Column
    private String RH;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public String getRH() {
        return RH;
    }

    public void setRH(String RH) {
        this.RH = RH;
    }
}
