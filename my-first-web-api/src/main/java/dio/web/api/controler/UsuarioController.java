package dio.web.api.controler;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController //da um direcionamento para a funcionalidade existente na aplicação (prox) *Não implementar regras de negócio no controler e sim na camada de serviços
@RequestMapping("/users")// => diz que todos os requests serão feitos através do /users
public class UsuarioController {

    @Autowired //injeção de conteúdo
    private UsuarioRepository repository;//é aqui onde aplicamos as regras de negócios

    @GetMapping()//dizendo para o Spring o caminho por onde vai acessar esse getter {mapeando}
    public List<Usuario> getUsers(){
       return repository.findAll();
    }

    @GetMapping("/{username}")//Caminho do mapping com atrelação da variável para que ela seja captada e inserida no parâmetro da aplicação
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }

    @DeleteMapping("/{id}")//Mapeando o delete (não pode ser feito pelo navegador, usar o postman
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping("")
    public void postUser(@RequestBody Usuario usuario){//@RequestBody é o que faz receber um body como json para usar para criar a instancia
        repository.save(usuario);
    }
}