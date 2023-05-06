package tutor.ship.com.demo.controller.dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import tutor.ship.com.demo.model.Cursos;
import tutor.ship.com.demo.model.Persona;

import java.sql.Date;
import java.sql.Time;

public class CronogramaCursoDTO {
    @NotBlank
    private Persona docente_id;
    @NotBlank
    private Persona tutor_id;
    @NotBlank
    private Time horaInicio;
    @NotBlank
    private Time horaFin;
    @NotBlank
    private Date fecha;
    @NotBlank
    private String estado;
}
