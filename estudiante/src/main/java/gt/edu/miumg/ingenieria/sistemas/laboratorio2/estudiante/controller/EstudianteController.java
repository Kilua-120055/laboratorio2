
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.controller;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.model.Estudiante;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.estudiante.sevirce.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService esser;
    @GetMapping ("/buscarTodos")
    public List<Estudiante> buscarTodos(){
    
        return (List<Estudiante>) this.esser.buscartodos();
    }
    
    @PostMapping("/registrar")
    public Estudiante registrar(@RequestBody(required = true) Estudiante varestu){
        return this.esser.registrar(varestu);
    }
}
