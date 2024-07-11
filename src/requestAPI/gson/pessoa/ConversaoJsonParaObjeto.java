package requestAPI.gson.pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = """
                {
                    "nome":"Rodrigo",
                    "cidade":"Brasília"
                }
                """;

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println(STR."Objeto Pessoa: \{pessoa}");
    }
}
