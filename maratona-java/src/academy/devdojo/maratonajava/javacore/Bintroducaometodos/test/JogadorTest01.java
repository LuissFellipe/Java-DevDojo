package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Jogador;

public class JogadorTest01 {
    static void main() {
        Jogador player1 = new Jogador();

        player1.setNome("Aizen");
        player1.setEnergia(4000);

        System.out.println("Nome: " + player1.getNome());
        System.out.println("Nome: " + player1.getEnergia());
    }
}
