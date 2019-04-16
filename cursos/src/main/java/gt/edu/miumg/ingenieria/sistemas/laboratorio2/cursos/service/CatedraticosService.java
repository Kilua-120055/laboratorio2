
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.dao.CatedraticosRepository;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Catedraticos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatedraticosService {
    @Autowired
     private CatedraticosRepository catrepo;

    public List<Catedraticos> buscartodos()
    {
        return (List<Catedraticos>) this.catrepo.findAll();
    }
    
    public Catedraticos registrar(Catedraticos varcat){
        return this.catrepo.save(varcat);
    }
}
