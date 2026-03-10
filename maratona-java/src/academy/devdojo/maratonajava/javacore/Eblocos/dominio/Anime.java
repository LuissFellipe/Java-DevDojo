package academy.devdojo.maratonajava.javacore.Eblocos.dominio;

public class Anime {
    private String nome;
    private int [] episodios;

    {



    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[1000];
        for (int i =0; i < episodios.length; i++){
            episodios[i]=i+1;
        }

        System.out.println(episodios);
        for (int episodio: this.episodios){
            System.out.println(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
