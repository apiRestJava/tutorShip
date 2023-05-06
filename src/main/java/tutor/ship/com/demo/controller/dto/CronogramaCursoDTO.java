package tutor.ship.com.demo.controller.dto;

import jakarta.validation.constraints.NotBlank;
import tutor.ship.com.demo.model.Personas;

import java.sql.Date;
import java.sql.Time;

public class CronogramaCursoDTO {
    @NotBlank
    private Personas docente_id;
    @NotBlank
    private Personas tutor_id;
    @NotBlank
    private Time horaInicio;
    @NotBlank
    private Time horaFin;
    @NotBlank
    private Date fecha;
    @NotBlank
    private String estado;
}
