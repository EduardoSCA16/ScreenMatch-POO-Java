package br.com.alura.screenmatch.models;

// Para herdar atributos e métdodos de outra classe, se usa "extends" e depois o nome da classe
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
