package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de " + titulo.getTitulo());
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }


}
