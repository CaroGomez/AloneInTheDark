package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.HistoriaClinica;
import org.springframework.data.repository.CrudRepository;

public interface IHistoriaClinicaDao extends CrudRepository<HistoriaClinica, Long> {
}
