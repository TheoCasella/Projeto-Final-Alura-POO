package Modelos;

public class MinhasPreferidas {

    public void incluir(Audio audio){
        if (audio.getClassificacao() > 8){
            System.out.println(audio.getTitulo() + " é um hit mundial!");
        } else if (audio.getClassificacao() > 6){
            System.out.println(audio.getTitulo() + " está no ouvido da galera! Vale a pena conferir");
        }
    }
}
