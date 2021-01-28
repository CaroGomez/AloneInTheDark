package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaDao extends CrudRepository<Persona, Long> {
}
