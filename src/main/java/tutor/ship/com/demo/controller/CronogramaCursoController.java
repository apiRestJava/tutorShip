package tutor.ship.com.demo.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tutor.ship.com.demo.controller.dto.CronogramaCursoDTO;
import tutor.ship.com.demo.model.CronogramaCurso;
import tutor.ship.com.demo.repository.CronogramaCursoRepository;
import org.modelmapper.ModelMapper;

@RestController
@RequestMapping("api/cronogramaCurso")
public class CronogramaCursoController {

    private final CronogramaCursoRepository cronogramaCursoRepository;

    public CronogramaCursoController(CronogramaCursoRepository cronogramaCursoRepository){
        this.cronogramaCursoRepository = cronogramaCursoRepository;
    }

    @GetMapping("/{id}")
    CronogramaCurso obtener(@PathVariable Integer id){
        return cronogramaCursoRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    CronogramaCurso store(@RequestBody @Validated CronogramaCursoDTO cronogramaCursoDTO){
        CronogramaCurso cronogramaCurso = new ModelMapper().map(cronogramaCursoDTO, CronogramaCurso.class);
        return cronogramaCursoRepository.save(cronogramaCurso);
    }
}
