
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.service;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.dao.CursosRepository;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Cursos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursosService {
    @Autowired
     private CursosRepository currepo;

    public List<Cursos> buscartodos()
    {
        return (List<Cursos>) this.currepo.findAll();
    }
    
    public Cursos crear(Cursos varcur){
        return this.currepo.save(varcur);
    }
}
