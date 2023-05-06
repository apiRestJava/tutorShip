package tutor.ship.com.demo.controller.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import tutor.ship.com.demo.model.CronogramaCurso;
import tutor.ship.com.demo.model.Persona;

import java.sql.Date;

public class DetalleCursoPersonaDTO {
    @NotBlank
    private Persona alumno_id;
    @NotBlank
    private CronogramaCurso cronograma_curso_id;
    @NotBlank
    private Persona tutor_id;
    @NotBlank
    private Date fecha;
    @NotBlank
    private String estado;
}
