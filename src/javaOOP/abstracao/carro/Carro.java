package javaOOP.abstracao.carro;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaTecnica() {
        System.out.println(STR."""
            Modelo: \{modelo}
            Ano: \{ano}
            Cor: \{cor}
        """);
    }

    int calculaIdade() {
        return 2023 - ano;
    }
}
