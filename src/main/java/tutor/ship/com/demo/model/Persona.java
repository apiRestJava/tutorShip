package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany
    @JoinColumn(name ="tipopersona_id" , referencedColumnName = "id")
    private TipoPersona tipopersona_id;

    private String nombresApellidos;
    private String correo;
    private String matricula;
    private String usuario;
    private String password;
    private String estado;
}
