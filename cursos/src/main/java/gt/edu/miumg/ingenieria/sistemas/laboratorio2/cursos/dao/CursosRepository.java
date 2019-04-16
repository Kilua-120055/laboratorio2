
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.dao;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Cursos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends CrudRepository<Cursos,Long> {
    
}
