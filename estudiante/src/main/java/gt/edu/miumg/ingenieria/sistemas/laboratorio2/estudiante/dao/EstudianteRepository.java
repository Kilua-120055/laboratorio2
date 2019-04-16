
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.dao;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante,Long>{
    
}
