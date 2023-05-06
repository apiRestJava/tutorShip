package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@Entity
public class CronogramaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Integer id;

    @OneToMany
    @JoinColumn( name = "curso_id", referencedColumnName = "id")
    private Cursos curso_id;

    @OneToMany
    @JoinColumn( name = "docente_id", referencedColumnName = "id")
    private Persona docente_id;

    @OneToMany
    @JoinColumn( name = "tutor_id", referencedColumnName = "id")
    private Persona tutor_id;

    private Time horaInicio;
    private Time horaFin;
    private Date fecha;
    private String estado;
}
