package co.udea.thedivines.serviciosalud.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {

    @Id
    private Long id;
    @Column
    private String fechaCita;
    @Column
    private String motivoConsulta;
    @Column
    private String nivelUrgencia;
    @Column
    private String tipoConsulta;
    @Column
    private String doctor;

    public Cita(){
    }

    public Cita(Long id, String fechaCita, String motivoConsulta, String nivelUrgencia, String tipoConsulta, String doctor) {
        this.id = id;
        this.fechaCita = fechaCita;
        this.motivoConsulta = motivoConsulta;
        this.nivelUrgencia = nivelUrgencia;
        this.tipoConsulta = tipoConsulta;
        this.doctor = doctor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getNivelUrgencia() {
        return nivelUrgencia;
    }

    public void setNivelUrgencia(String nivelUrgencia) {
        this.nivelUrgencia = nivelUrgencia;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}
