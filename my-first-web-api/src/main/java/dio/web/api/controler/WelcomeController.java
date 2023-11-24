package dio.web.api.controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Anotation que diz que alguns dos seus métodos serão recursos HTTP, os métodos que serão recursos devem ser mapeados
public class WelcomeController {

    @GetMapping //Como não tem nada como parâmetro essa é definida como a pagina inicial da API
    public String welcome(){
        return "Welcome to my Spring Boot Web API";
    }
}
