
package gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.controller;

import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.model.Catedraticos;
import gt.edu.miumg.ingenieria.sistemas.laboratorio2.cursos.service.CatedraticosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catedratico")
public class CatedraticosController {
    @Autowired
    private CatedraticosService catser;
    @GetMapping("/buscarTodos")
    public List<Catedraticos>buscarTodos(){
        return (List<Catedraticos>) this.catser.buscartodos();
    }
    
     @PostMapping("/registrar")
    public Catedraticos registrar(@RequestBody(required = true) Catedraticos varcat){
        return this.catser.registrar(varcat);
    }
    
}
