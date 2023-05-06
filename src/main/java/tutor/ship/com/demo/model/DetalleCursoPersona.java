package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class DetalleCursoPersona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @OneToMany
    @JoinColumn(name = "alumno_id", referencedColumnName = "id")
    private Persona alumno_id;

    @OneToMany
    @JoinColumn(name = "cronograma_curso_id", referencedColumnName = "id")
    private CronogramaCurso cronograma_curso_id;

    @OneToMany
    @JoinColumn(name = "tutor_id", referencedColumnName = "id")
    private Persona tutor_id;

    private Date fecha;
    private String estado;
}
