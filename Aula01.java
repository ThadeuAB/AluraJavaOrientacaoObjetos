import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Aula01 {

    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setTitulo("The Godfather");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalie(8);
        meuFilme.avalie(9.5);
        meuFilme.avalie(10);
        meuFilme.avalie(8.5);
        meuFilme.exibeFichaTecnica();

        Filme outroFilme = new Filme();
        outroFilme.setTitulo("Avatar");
        outroFilme.setAnoLancamento(2009);
        outroFilme.setDuracaoEmMinutos(162);
        outroFilme.setIncluidoNoPlano(true);

        outroFilme.avalie(7);
        outroFilme.avalie(8);
        outroFilme.exibeFichaTecnica();

        Serie lost = new Serie();
        lost.setTitulo("Lost");
        lost.setAnoLancamento(2004);
        lost.setIncluidoNoPlano(true);
        lost.setNumeroDeTemporadas(6);
        lost.setAtiva(false);
        lost.setEpisodiosPorTemporada(20);
        lost.setMinutosPorEpisodio(44);


        lost.avalie(7.5);
        lost.avalie(8);
        lost.avalie(6.1);
        lost.exibeFichaTecnica();

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(episodio);






    }

}
