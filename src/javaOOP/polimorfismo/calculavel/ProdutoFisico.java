package javaOOP.polimorfismo.calculavel;

public class ProdutoFisico extends Produto implements Calculavel {
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
