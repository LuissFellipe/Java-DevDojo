package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Gato;

public class GatoTest01 {
    static void main() {
        Gato gatos = new Gato();

        gatos.setNome("Jade");
        gatos.setAltura(0);
        gatos.setCor("Cinza");

        System.out.println("Nome do gato: " + gatos.getNome());



    }
}
