package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.dao.IPacienteDao;
import co.udea.thedivines.serviciosalud.models.entity.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements IPacienteService{

    @Autowired
    private IPacienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll(){
        return (List<Paciente>) clienteDao.findAll();
    }
}
