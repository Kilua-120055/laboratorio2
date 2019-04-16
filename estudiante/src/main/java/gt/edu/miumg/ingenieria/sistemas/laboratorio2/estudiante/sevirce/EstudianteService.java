
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.sevirce;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.dao.EstudianteRepository;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.model.Estudiante;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository esrepo;

    public List<Estudiante> buscartodos()
    {
        return (List<Estudiante>) this.esrepo.findAll();
    }
    
    public Estudiante registrar(Estudiante varestu){
        return this.esrepo.save(varestu);
    }
}


