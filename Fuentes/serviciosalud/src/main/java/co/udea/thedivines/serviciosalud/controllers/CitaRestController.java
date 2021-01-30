package co.udea.thedivines.serviciosalud.controllers;

import co.udea.thedivines.serviciosalud.models.entity.Cita;
import co.udea.thedivines.serviciosalud.models.services.ICitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api2")
public class CitaRestController {

    @Autowired
    private ICitaService citaService;

    @GetMapping("/citas")
    public List<Cita> index(){
        return citaService.findAll();
    }

    @GetMapping("/citas/{id}")
    public Cita show(@PathVariable Long id){
        return citaService.findById(id);
    }

    @PostMapping("/citas")
    @ResponseStatus(HttpStatus.CREATED)
    public Cita create(@RequestBody Cita cita){
        return citaService.save(cita);
    }

    @PutMapping("/citas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Cita update(@RequestBody Cita cita, @PathVariable Long id){
        Cita citaActual = citaService.findById(id);

        citaActual.setFechaCita(cita.getFechaCita());
        citaActual.setMotivoConsulta(cita.getMotivoConsulta());
        citaActual.setNivelUrgencia(cita.getNivelUrgencia());
        citaActual.setTipoConsulta(cita.getTipoConsulta());
        citaActual.setDoctor(cita.getDoctor());

        return citaService.save(citaActual);
    }

    @DeleteMapping("/citas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        citaService.delete(id);
    }

}
