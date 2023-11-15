package dio.springboot.app;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {

    private Gson gson = new Gson();

    public ViaCepResponse coverter(String json){
        ViaCepResponse response = gson.fromJson(json, ViaCepResponse.class);
        return response;
    }
}
