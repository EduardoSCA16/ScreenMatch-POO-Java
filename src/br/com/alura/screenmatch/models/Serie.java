package br.com.alura.screenmatch.models;

// Para herdar atributos e métodos de outra classe, se usa "extends" e depois o nome da classe
public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEspisodio;

    public Serie(String nome, int anoLancamento) {
        super(nome, anoLancamento);
    }

    // Getters e Setters
    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEspisodio() {
        return minutosPorEspisodio;
    }

    public void setMinutosPorEspisodio(int minutosPorEspisodio) {
        this.minutosPorEspisodio = minutosPorEspisodio;
    }

    // Sobrescrevendo um método
    // @Override possibilita a sobrescrita de um método
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * (episodiosPorTemporada * minutosPorEspisodio);
    }
}
