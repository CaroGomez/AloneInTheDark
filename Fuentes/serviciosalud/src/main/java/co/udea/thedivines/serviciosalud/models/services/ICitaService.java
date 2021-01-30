package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.entity.Cita;

import java.util.List;

public interface ICitaService {

    public List<Cita> findAll();
    public Cita findById(Long id);
    public Cita save(Cita cita);
    public void delete(Long id);
}
