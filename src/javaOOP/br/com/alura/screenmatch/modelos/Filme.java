package javaOOP.br.com.alura.screenmatch.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public double getMediaAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println(STR."""
                Nome do filme: \{nome}
                Ano de laçamento: \{anoDeLancamento}
                """);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
}