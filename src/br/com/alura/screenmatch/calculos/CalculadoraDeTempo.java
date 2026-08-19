package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.models.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    // aqui ocorreu uma sobrecarga de método
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    // este método resolve o caso de cima que foi uma sobrecarga de método
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração de minutos de " + titulo.getNome());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
