package tutor.ship.com.demo.model;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column (name ="id")
    private Integer id;
    private String denominacion;
    private String codigo;
    @ManyToMany
    @JoinColumn(name ="persona_id" , referencedColumnName = "id")
    private Persona persona_id;
    private String estado;
}
