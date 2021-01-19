package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.entity.Paciente;

import java.util.List;

public interface IPacienteService {

    public List<Paciente> findAll();
}
