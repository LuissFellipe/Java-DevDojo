package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Neymar");
        Time time = new Time("Santos");
        Jogador[] jogadores = {jogador1};

        jogador1.setTime(time);

        time.setJogadores(jogadores);

        jogador1.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}