package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Cita;
import org.springframework.data.repository.CrudRepository;

public interface ICitaDao extends CrudRepository<Cita, Long> {
}
