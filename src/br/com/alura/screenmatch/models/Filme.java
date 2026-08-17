package br.com.alura.screenmatch.models;

public class Filme {
    public String nome;
    public int anoLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    public int duracaoEmMinutos;

    // Getters e Setters
    // Usados quando um atributo possui visibilidade restrita (private)
    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    // Métodos
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
