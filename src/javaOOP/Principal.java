package javaOOP;

import javaOOP.br.com.alura.screenmatch.modelos.Filme;
import javaOOP.br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
//        Filme meuFilme = new Filme();
//        meuFilme.setNome("O Poderoso Chefão");
//        meuFilme.setAnoDeLancamento(1972);
//        meuFilme.setDuracaoEmMinutos(175);
//
//        meuFilme.exibeFichaTecnica();
//        meuFilme.avalia(8);
//        meuFilme.avalia(9);
//        meuFilme.avalia(8.5);
//
//        System.out.println(meuFilme.getSomaDasAvaliacoes());
//        System.out.println(meuFilme.getTotalDeAvaliacoes());
//        System.out.println(meuFilme.getMediaAvaliacoes());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporadas(6);
        lost.setEpisodiosPorTemporada(24);
    }
}