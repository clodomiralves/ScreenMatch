import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Top Gun");
        filme1.setAnoDeLancamento(1998);
        filme1.setDuracaoEmMinutos(120);
        filme1.setIncluidoNoPlano(true);

        filme1.avalia(10);
        filme1.avalia(2);
        filme1.avalia(6);
        filme1.avalia(8);
        filme1.exibeFichaTecnica();


        Serie suits = new Serie();

        suits.setNome("Suits");
        suits.setTemporadas(9);
        suits.setMinutosPorEpisodio(70);
        suits.setEpisodiosPorTemporadas(10);
        suits.getDuracaoEmMinutos();
        suits.setAtiva(false);
        suits.avalia(10);
        suits.avalia(6);


        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(suits);
        episodio.setTotalVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);


    }
}