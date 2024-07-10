package listaColecoesDeDados.listaDeObjetosDistintos.formas;

class Circulo implements Forma {
    double raio;

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}