package Modelos;

public class Musica extends Audio{
    private String album;
    private String cantor;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if (getTotalCurtidas() > 250) {
            return 10;
        } else if (getTotalCurtidas() > 150){
            return 8;
        } else {
            return 6;
        }
    }

    @Override
    public void exibirFichaTecnica() {
        super.exibirFichaTecnica();
        System.out.println("Álbum da música: " + getAlbum());
        System.out.println("Cantor(a) da música: " + getCantor());
        System.out.println("Gênero da música: " + getGenero());
        System.out.println("Classificação: " + getClassificacao());
    }
}
