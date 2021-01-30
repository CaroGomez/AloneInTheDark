package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    public List<Paciente> findAll();
    public Paciente findById(Long id);
    public Paciente save(Paciente paciente);
    public void delete(Long id);
}
