package tutor.ship.com.demo.controller.dto;

import jakarta.validation.constraints.NotBlank;

public class CursosDTO {
    private Integer id;
    @NotBlank
    private String denominacion;
    @NotBlank
    private String codigo;
    @NotBlank
    private Integer persona_id;
    @NotBlank
    private String estado;

}
