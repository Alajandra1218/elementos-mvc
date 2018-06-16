/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin

public class ControladorMensaje {

    @Autowired
    RepositorioMensaje repoMensa;

    @GetMapping("/mensaje")

    public List<Mensaje> buscarTodos() {
        return repoMensa.findAll();
    }

    @GetMapping("/mensaje/{Id}")

    public Mensaje bucarPorId(@PathVariable String Id) {
        Mensaje mensa = new Mensaje();
        return repoMensa.findById(Id).get();
    }
}
