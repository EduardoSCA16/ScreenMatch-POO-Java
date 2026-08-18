import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

// @Deprecated = método ou classe que está obsoleto e não deve ser mais utilizado
// @Override = Sobrescrever um método da classe "mãe"
// @NotNull = Usada para validar que um atributo não seja nulo

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Meu Malvado Favorito");
        meuFilme.setAnoLancamento(2010);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do meu filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Média das avaliações: %.1f\n", meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEspisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

    }
}
