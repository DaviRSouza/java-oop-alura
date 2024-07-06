package javaOOP;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println(STR."""
                Nome do filme: \{nome}
                Ano de laçamento: \{anoDeLancamento}
                """);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double getMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}