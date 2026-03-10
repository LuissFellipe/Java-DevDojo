package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main() {
        Anime anime = new Anime();


        anime.init("Naruto", "TV", 12, "Aventura");
        anime.imprime();

    }
}
