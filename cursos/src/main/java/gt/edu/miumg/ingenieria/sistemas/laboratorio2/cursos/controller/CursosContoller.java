
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Cursos;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.service.CursosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursosContoller {
    @Autowired
    private CursosService curser;
    @GetMapping("/buscarTodos")
    public List<Cursos>buscarTodos(){
        return (List<Cursos>) this.curser.buscartodos();
    }
    
     @PostMapping("/crear")
    public Cursos crear(@RequestBody(required = true) Cursos varcur){
        return this.curser.crear(varcur);
    }
    
}
