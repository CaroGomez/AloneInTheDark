package co.udea.thedivines.serviciosalud.controllers;

import co.udea.thedivines.serviciosalud.models.entity.Paciente;
import co.udea.thedivines.serviciosalud.models.services.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PacienteRestController {

    @Autowired
    private IPacienteService pacienteService;

    @GetMapping("/pacientes")
    public List<Paciente> index(){
        return pacienteService.findAll();
    }
}
