package co.udea.thedivines.serviciosalud.models.dao;

import co.udea.thedivines.serviciosalud.models.entity.Pago;
import org.springframework.data.repository.CrudRepository;

public interface IPagoDao extends CrudRepository<Pago, Long> {
}
