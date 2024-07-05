package dio.web_api.controller;

import dio.web_api.model.Usuario;
import dio.web_api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

   // @GetMapping("/users")
    @GetMapping()//pois usei o REQUESTMAPPING("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    //@GetMapping("/{username}")
    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    //@DeleteMapping("/users/{id}")
    @DeleteMapping("/{id}")
    public void deleter(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    //@PostMapping("/users")
    @PostMapping()
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
