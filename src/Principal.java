import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.models.Episodio;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

import java.util.ArrayList;

// @Deprecated = método ou classe que está obsoleto e não deve ser mais utilizado
// @Override = Sobrescrever um método da classe "mãe"
// @NotNull = Usada para validar que um atributo não seja nulo

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme("Meu Malvado Favorito");
        meuFilme.setAnoLancamento(2010);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do meu filme: " + meuFilme.getDuracaoEmMinutos() + "\n\n");

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Média das avaliações: %.1f", meuFilme.pegaMedia());
        System.out.println("\n\n");

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEspisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos() + "\n\n");

        Filme filmeShrek = new Filme("Shrek 2");
        filmeShrek.setAnoLancamento(2008);
        filmeShrek.setDuracaoEmMinutos(210);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(filmeShrek);
        calculadora.inclui(lost);
        System.out.println("Tempo total da calculadora: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville");
        filmeDoPaulo.setAnoLancamento(2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        // Criando uma Array List
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeDoPaulo);
        listaFilmes.add(meuFilme);
        System.out.println("\n\n---- Array List ----");
        System.out.println("Tamanho da lista " + listaFilmes.size());
        System.out.println("Primeiro filme: " + listaFilmes.get(0).getNome());
        System.out.println(listaFilmes);
        System.out.println("toString do filme: " + listaFilmes.get(0).toString());


    }
}
