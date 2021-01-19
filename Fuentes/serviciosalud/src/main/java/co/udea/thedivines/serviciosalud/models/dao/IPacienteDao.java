package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface IPacienteDao extends CrudRepository <Paciente, Long> {
}
