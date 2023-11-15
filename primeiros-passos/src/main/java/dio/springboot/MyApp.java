package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //Indicando que é um component Dããããããh
public class MyApp implements CommandLineRunner {

    @Autowired //Injeção de dependencia
    private Calculadora calc;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é: " + calc.somar(2, 7));
    }
}
