package co.udea.thedivines.serviciosalud.models.entity;


import javax.persistence.*;

@Entity
@Table(name="pacientes")
public class Paciente extends Persona{
    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;
    @Column
    private String EPS;
    @Column
    private String RH;

    @Override
    public Long getId() {
        return id;
    }

    @Override
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
