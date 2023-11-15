package dio.springboot;

import dio.springboot.app.ConversorJson;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication //Notação para indicar o arquivo por onde tudo será chamado
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
	}
}
