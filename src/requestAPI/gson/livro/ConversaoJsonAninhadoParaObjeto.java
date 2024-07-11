package requestAPI.gson.livro;

import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {
    public static void main(String[] args) {
        String jsonLivro = """
                {
                    "titulo":"Aventuras do Java",
                    "autor":"Akemi",
                    "editora":{
                    "nome":"TechBooks",
                    "cidade":"São Paulo"
                    }
                }""";

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println(STR."Objeto Livro: \{livro}");
    }

}