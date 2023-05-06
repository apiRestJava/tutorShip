package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Data
@Entity
@Table(name = "cronogramacurso")
public class CronogramaCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn( name = "curso_id" )
    Cursos curso_id;

    @ManyToOne
    @JoinColumn( name = "docente_id")
    Persona docente_id;

    @ManyToOne
    @JoinColumn( name = "tutor_id")
    Persona tutor_id;

    private Time horaInicio;
    private Time horaFin;
    private Date fecha;
    private String estado;
}
