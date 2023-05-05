package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import javax.naming.Name;

@Data
@Entity
public class TipoPersona {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer IdTipoPersona;
    private String tipo;
    private String estado;

}
