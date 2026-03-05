package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;
import java.util.Arrays;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Dogs;

public class DogsTest01 {
    static void main() {
        Dogs[] myDogs = new Dogs[3];
        myDogs[0] = new Dogs();
        myDogs[0].nome = "Fred";

        myDogs[1] = new Dogs();
        myDogs[1].nome = "Marge";
        System.out.println("O nome do primeiro cão é: " + myDogs[0].nome);
    }
}
