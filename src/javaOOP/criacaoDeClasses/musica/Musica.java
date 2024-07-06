package javaOOP.criacaoDeClasses.musica;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println(STR."""
            Título da música: \{titulo}
            Artista: \{artista}
            "Ano de lançamento: \{anoLancamento}
        """);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}
