
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.dao;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Catedraticos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatedraticosRepository extends CrudRepository<Catedraticos,Long> {
    
}
