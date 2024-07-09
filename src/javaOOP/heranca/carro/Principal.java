package javaOOP.heranca.carro;

public class Principal {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.definirCor("Preto");
        meuCarro.definirMarca("Fiat");
        meuCarro.definirAnoFabricacao(2019);

        meuCarro.exibirInfo();
    }
}
