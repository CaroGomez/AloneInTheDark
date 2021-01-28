package co.udea.thedivines.serviciosalud.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="medicos")
public class Medico implements Serializable {

    @Id
    /*@GeneratedValue(strategy = GenerationType.IDENTITY)*/
    private Long id;
    @Column
    String tipo_medico;


    public String getTipo_medico() {
        return tipo_medico;
    }

    public void setTipo_medico(String tipo_medico) {
        this.tipo_medico = tipo_medico;
    }
}
