package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

// Para herdar atributos e métdodos de outra classe, se usa "extends" e depois o nome da classe
// "implements" indica que a classe segue o contrato da interface Classificavel,
// sendo obrigada a implementar os métodos definidos por ela
public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Construtor
    public Filme(String nome) {
        this.setNome(nome);
    }

    // Methods
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ")";
    }
}
