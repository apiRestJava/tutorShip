package tutor.ship.com.demo.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tutor.ship.com.demo.controller.dto.DetalleCursoPersonaDTO;
import tutor.ship.com.demo.model.DetalleCursoPersona;
import tutor.ship.com.demo.repository.DetalleCursoPersonaRepository;

@RestController
@RequestMapping("api/detalleCursoPersona")
public class DetalleCursoPersonaController {
    private  final DetalleCursoPersonaRepository detalleCursoPersonaRepository;

    public DetalleCursoPersonaController(DetalleCursoPersonaRepository detalleCursoPersonaRepository){
        this.detalleCursoPersonaRepository = detalleCursoPersonaRepository;
    }

    @GetMapping("/{id}")
    DetalleCursoPersona obtener(@PathVariable Integer id){
        return detalleCursoPersonaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    DetalleCursoPersona store(@RequestBody @Validated DetalleCursoPersonaDTO detalleCursoPersonaDTO){
        DetalleCursoPersona detalleCursoPersona = new ModelMapper().map(detalleCursoPersonaDTO, DetalleCursoPersona.class);
        return detalleCursoPersonaRepository.save(detalleCursoPersona);
    }

}
