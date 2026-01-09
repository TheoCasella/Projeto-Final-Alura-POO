package Modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getClassificacao() {
        if (getTotalReproducoes() > 1000){
            return 10;
        } else if (getTotalReproducoes() > 500){
            return 8;
        } else {
            return 6;
        }
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Host do Podcast: " + getHost());
        System.out.println("Descrição do Podcast: " + getDescricao());
        System.out.println("Classificação: " + getClassificacao());

    }
}
