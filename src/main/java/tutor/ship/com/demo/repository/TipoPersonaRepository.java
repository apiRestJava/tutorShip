package tutor.ship.com.demo.repository;
import tutor.ship.com.demo.model.TipoPersona;

import java.util.Optional;

public interface TipoPersonaRepository {
    Optional<TipoPersona> findById(Integer id);
    Optional<TipoPersona> finOneByidAndTipoPersona(Integer id,String tipopersona);
}
