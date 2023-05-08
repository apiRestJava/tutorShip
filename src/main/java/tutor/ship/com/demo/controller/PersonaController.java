package tutor.ship.com.demo.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tutor.ship.com.demo.controller.dto.PersonaDTO;
import tutor.ship.com.demo.model.Personas;
import tutor.ship.com.demo.repository.PersonaRepository;

@RestController
@RequestMapping("api/persona")
public class PersonaController {
    @Autowired
    private PersonaRepository personaRepository;

    @GetMapping
    Page<Personas> index(@PageableDefault(sort = "id", size = 5)Pageable pageable){
        return personaRepository.findAll(pageable);
    }
    @GetMapping("/{id}")
    Personas obtener(@PathVariable Integer id){
        return personaRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/fenix")
    Personas fenix(@RequestBody @Validated PersonaDTO personaDTO){
        Personas personas = new ModelMapper().map(personaDTO, Personas.class);
        return personaRepository.save(personas);
    }
}
