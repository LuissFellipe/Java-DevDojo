package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cachorro;

public class CachorroTest01 {
    static void main() {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Jade";
        cachorro1.tamanho = 20;
        cachorro1.latir();

        cachorro2.nome = "Meg";
        cachorro2.tamanho = 50;
        cachorro2.latir();


        System.out.println("O nome do cachorro 1 é: " + cachorro1.nome);
        System.out.println("O tamanho da " + cachorro2.nome + " é " + cachorro2.tamanho);




    }
}
