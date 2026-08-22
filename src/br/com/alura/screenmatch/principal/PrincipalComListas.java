package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;
import br.com.alura.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main(String[] args) {
        Filme meuFilme = new Filme("Meu Malvado Favorito", 2010);
        meuFilme.avalia(9);
        Filme filmeShrek = new Filme("Shrek 2", 2008);
        filmeShrek.avalia(6);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        // Um exemplo de variável de referência
        // Ambos apontam para o mesmo objeto
        Filme f1 = filmeDoPaulo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(filmeShrek);
        lista.add(lost);

        // Forma de percorrer uma lista
        // foreach: pega todo item dentro de uma lista que é do tipo Titulo
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        // Ordenação de listas
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rocky Santana");
        buscaPorArtista.add("Acegeek Silva");
        System.out.println("\nAntes de ordenar");
        System.out.println(buscaPorArtista);

        // Organizando a lista em ordem alfabética
        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("\nLista de títulos em ordem alfabética");
        Collections.sort(lista);
        System.out.println(lista);

        // Usando um Comparator para definir como os elementos da lista serão ordenados:
        // Comparator.comparing() cria um critério de comparação usando uma propriedade do objeto.
        // Titulo::getAnoLancamento é uma referência ao método getAnoLancamento(),
        // que será usado para comparar os objetos pelo ano de lançamento.
        // O sort() então usa esse critério para ordenar a lista.
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("\nOrdenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
