package Modelos;

public class Audio {
    //Atributos
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificacao;

    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(double duracao){
        this.duracao = duracao;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    //Métodos
    public void curtir(){
        totalCurtidas++;
    }

    public void reproduzir(){
        totalReproducoes++;
    }

    public void exibirFichaTecnica(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + " min");
        System.out.println("Total de Reproduções: " + getTotalReproducoes());
        System.out.println("Total de Curtidas: " + getTotalCurtidas());
    }

}
