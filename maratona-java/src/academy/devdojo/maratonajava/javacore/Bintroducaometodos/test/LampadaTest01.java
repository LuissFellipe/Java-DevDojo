package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Lampada;

public class LampadaTest01 {
    static void main() {
        Lampada lampada = new Lampada();

        lampada.LigarLuz();
        if (lampada.ligada){
            System.out.println("Lampada Ligada");
        }


    }
}
