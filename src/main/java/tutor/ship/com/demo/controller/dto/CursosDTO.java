package tutor.ship.com.demo.controller.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import tutor.ship.com.demo.model.Personas;
@Getter
@Setter
public class CursosDTO {

    private String denominacion;
    private String codigo;
    private Personas persona_id;
    private String estado;

}
