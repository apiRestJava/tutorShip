package tutor.ship.com.demo.model;
import ch.qos.logback.core.model.Model;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Cascade;

@Data
@Entity
@Table(name = "cursos")
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column (name ="id")
    private Integer id;

    private String denominacion;
    private String codigo;

    @OneToOne
    @JoinColumn(name ="persona_id")
    Persona persona_id;

    private String estado;
}
