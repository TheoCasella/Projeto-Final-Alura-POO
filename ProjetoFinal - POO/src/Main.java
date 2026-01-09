import Modelos.MinhasPreferidas;
import Modelos.Musica;
import Modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        //Músicas
        Musica musica1 = new Musica();
        musica1.setCantor("Tim Maia");
        musica1.setAlbum("Racional");
        musica1.setDuracao(3.29);
        musica1.setTitulo("Que beleza");
        musica1.setGenero("MPB");
        for (int i = 0; i < 300; i++){
            musica1.curtir();
        }
        for (int i = 0; i < 2000; i++){
            musica1.reproduzir();
        }
        musica1.exibirFichaTecnica();
        System.out.println(" ");
        System.out.println(" ***** ");
        System.out.println(" ");
        //Podcast
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Podtech");
        podcast1.setDescricao("Um podcast que transmite notícias do mundo da tecnologia diariamente");
        podcast1.setHost("Pedro Tech");
        podcast1.setDuracao(25);
        for (int i = 0; i < 2000; i++){
            podcast1.curtir();
        }
        for (int i = 0; i < 600; i++){
            podcast1.reproduzir();
        }
        podcast1.exibirFichaTecnica();
        System.out.println(" ");
        System.out.println(" ***** ");
        System.out.println(" ");
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.incluir(musica1);
        minhasPreferidas.incluir(podcast1);
    }
}