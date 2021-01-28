package co.udea.thedivines.serviciosalud.controllers;

import co.udea.thedivines.serviciosalud.models.entity.Persona;
import co.udea.thedivines.serviciosalud.models.services.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonaRestController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/personas")
    public List<Persona> index(){
        return personaService.findAll();
    }
}
