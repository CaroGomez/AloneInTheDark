package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Consulta;
import org.springframework.data.repository.CrudRepository;

public interface IConsultaDao extends CrudRepository<Consulta, Long> {
}
