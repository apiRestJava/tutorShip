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

    @OneToOne
    @JoinColumn( name = "docente_id")
    Personas docente_id;

    @ManyToOne
    @JoinColumn( name = "tutor_id")
    Personas tutor_id;

    @Column(name = "horainicio")
    private Time horaInicio;

    @Column(name = "horafin")
    private Time horaFin;

    private Date fecha;
    private String estado;
}
