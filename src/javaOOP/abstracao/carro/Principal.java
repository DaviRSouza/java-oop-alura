package javaOOP.abstracao.carro;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Gol";
        meuCarro.ano = 2023;
        meuCarro.cor = "Preto";

        meuCarro.exibeFichaTecnica();

        System.out.println(STR."Idade do carro: \{meuCarro.calculaIdade()} anos");
    }
}
