package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
//ilustra as requisições que são usadas na API
@Repository //anotation que diz que a classe exporta para um repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getId() == null){
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir o usuário.\n", id);
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("victor", "password"));
        usuarios.add(new Usuario("icaro", "masterpass"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.printf("FIND/id - recebendo o id: %d para localizar um usuário.\n", id);
        return new Usuario("victor", "password");
    }

    public Usuario findByUsername(String username){
        System.out.printf("FIND/username - Recebendo o username: %s para localizar um usuário.", username);
        return new Usuario("victor", "password");
    }


}
