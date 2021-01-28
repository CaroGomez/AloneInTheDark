package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Medico;
import org.springframework.data.repository.CrudRepository;

public interface IMedicoDao extends CrudRepository<Medico, Long> {
}
