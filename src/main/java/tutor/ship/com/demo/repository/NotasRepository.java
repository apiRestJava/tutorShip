package tutor.ship.com.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tutor.ship.com.demo.model.Notas;

import java.util.Optional;

public interface NotasRepository extends JpaRepository<Notas,Integer> {

    @Override
    Optional<Notas> findById(Integer id);
    Optional<Notas> finOneByIdAndNotas(Integer id,String notas);
}
