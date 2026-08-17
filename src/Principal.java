import br.com.alura.screenmatch.models.Filme;

public class Principal {
    static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Meu Malvado Favorito";
        meuFilme.anoLancamento = 2010;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Média das avaliações: %.1f", meuFilme.pegaMedia());

    }
}
