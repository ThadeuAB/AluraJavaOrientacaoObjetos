package br.com.alura.screenmatch.modelos;

public class Titulo {

    private String titulo;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Incluido no plano: " + isIncluidoNoPlano());
        System.out.println("Ano de lancamento: " + getAnoLancamento());
        System.out.println("Duracao(min): " + getDuracaoEmMinutos());
        System.out.println("Total de avaliacoes: " + getTotalAvaliacoes());
        System.out.println("Avaliacao: " + pegaMedia());
        System.out.println("************************");
    }

    public void avalie(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }


}

