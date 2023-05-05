package tutor.ship.com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Notas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")

    private Integer id;
    @ManyToMany
    @JoinColumn(name ="cronograma_curso_id" , referencedColumnName = "cronograma_curso_id")
    private Persona cronograma_curso_id;
    @ManyToMany
    @JoinColumn(name ="alumno_id" , referencedColumnName = "alumno_id")
    private Persona alumno_id;
    @OneToMany
    @JoinColumn(name ="docente_tutor_id" , referencedColumnName = "docente_tutor_id")
    private Persona docente_tutor_id;
    private double nota;
    private LocalDateTime fecha;
    private String estado;
}
