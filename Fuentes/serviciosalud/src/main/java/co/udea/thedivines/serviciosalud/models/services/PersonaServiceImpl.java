package co.udea.thedivines.serviciosalud.models.services;

import co.udea.thedivines.serviciosalud.models.entity.Paciente;
import co.udea.thedivines.serviciosalud.models.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService{

    @Autowired
    private IPersonaService personaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Persona> findAll(){
        return (List<Persona>) personaDao.findAll();
    }
}
