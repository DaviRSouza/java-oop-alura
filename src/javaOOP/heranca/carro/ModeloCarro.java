package javaOOP.heranca.carro;

public class ModeloCarro extends Carro {
    private String marca;
    private String cor;
    private int anoFabricacao;

    public void definirMarca(String marca) {
        this.marca = marca;
    }

    public void definirCor(String cor) {
        this.cor = cor;
    }

    public void definirAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        super.exibirInfo();
    }
}
