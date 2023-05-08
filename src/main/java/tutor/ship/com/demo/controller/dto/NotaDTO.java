package tutor.ship.com.demo.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
@Data
public class NotaDTO {
  @Size(min=20 ,max=25)
    @NotBlank
    private Integer cronograma_curso_id;
    @NotBlank
    private Integer alumno_id;
    @NotBlank
    private Integer docente_id;
    private Date fecha;
    @NotBlank
    private String estado;


}
