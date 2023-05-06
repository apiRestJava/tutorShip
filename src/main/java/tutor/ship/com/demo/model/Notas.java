package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@Entity
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToMany
    @JoinColumn(name ="cronograma_curso_id" , referencedColumnName = "id")
    private CronogramaCurso cronograma_curso_id;

    @ManyToMany
    @JoinColumn(name ="alumno_id" , referencedColumnName = "id")
    private Persona alumno_id;

    @OneToMany
    @JoinColumn(name ="docente_tutor_id" , referencedColumnName = "id")
    private Persona docente_tutor_id;

    private double nota;
    private Date fecha;
    private String estado;
}
