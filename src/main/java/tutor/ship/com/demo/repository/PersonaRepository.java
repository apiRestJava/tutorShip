package tutor.ship.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tutor.ship.com.demo.model.DetalleCursoPersona;
import tutor.ship.com.demo.model.Persona;

import java.util.Optional;

public interface PersonaRepository extends JpaRepository<Persona, Integer> {
    @Override
    Optional<Persona>findById(Integer id);
    Optional<Persona> findByUsuarioAndPassword(String usuario, String password);
    Optional<Persona> findByEstado(String estado);
    Optional<Persona> findByMatricula(String matricula);
    Optional<Persona> findByNombresApellidos(String nombresApeliidos);


}
