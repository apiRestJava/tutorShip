package tutor.ship.com.demo.controller;

import jakarta.persistence.EntityNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import tutor.ship.com.demo.controller.dto.NotaDTO;
import tutor.ship.com.demo.model.Notas;
import tutor.ship.com.demo.repository.NotasRepository;

@RestController
@RequestMapping("api/notas")
public class NotaController {
    @Autowired
    private NotasRepository notasRepository;

    @GetMapping("/{id}")
    Notas obtener(@PathVariable Integer id){
        return notasRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
    @ResponseStatus(HttpStatus.CREATED)
   @PostMapping
    Notas crear(@RequestBody @Validated NotaDTO notasDto){
        Notas notas=new ModelMapper().map(notasDto,Notas.class);
        return notasRepository.save(notas);
   }
   @PutMapping("/{id}")
    Notas actualizar(@PathVariable Integer id ,@RequestBody NotaDTO notaDTO){
        Notas notas=new ModelMapper().map(notaDTO,Notas.class);
        return notasRepository.save(notas);
   }
  @ResponseStatus(HttpStatus.CREATED)
    @DeleteMapping("/{id}")
    void eliminar(@PathVariable Integer id){
        Notas notas=notasRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        notasRepository.delete(notas);
  }
}
