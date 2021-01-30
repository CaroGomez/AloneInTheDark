package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICitaDao extends CrudRepository<Cita, Long >{
}
