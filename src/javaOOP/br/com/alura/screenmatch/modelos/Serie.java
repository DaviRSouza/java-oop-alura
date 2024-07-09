package javaOOP.br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int duracaoMediaEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoMediaEpisodio() {
        return duracaoMediaEpisodio;
    }

    public void setDuracaoMediaEpisodio(int duracaoMediaEpisodio) {
        this.duracaoMediaEpisodio = duracaoMediaEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.episodiosPorTemporada * this.duracaoMediaEpisodio * this.temporadas;
    }
}
