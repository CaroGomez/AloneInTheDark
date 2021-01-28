package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.entity.Persona;

import java.util.List;

public interface IPersonaService {

    public List<Persona> findAll();

}
