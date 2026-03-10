package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Computador;

public class ComputadorTest01 {
    static void main() {

    Computador comp1 = new Computador("Dell");
    Computador comp2 = new Computador("Apple", 16);

    System.out.println("--- Computador 1 ---");
    comp1.imprimirConfig();

    System.out.println("--- Computador 2 ---");
    comp2.imprimirConfig();
    }

}

