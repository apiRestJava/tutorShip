package tutor.ship.com.demo.controller.dto;

import jakarta.validation.constraints.NotBlank;

public class PersonaDTO {

    private Integer tipopersona_id;

    @NotBlank
    private  String nombresApellidos;
    @NotBlank
    private String correo;
    @NotBlank
    private  String matricula;
    @NotBlank
    private  String usuario;
    @NotBlank
    private String password;

    @NotBlank
    private  String estado;
}
