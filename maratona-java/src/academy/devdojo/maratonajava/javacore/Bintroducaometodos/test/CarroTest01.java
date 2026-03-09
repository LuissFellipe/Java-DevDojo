package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Carro;

public class CarroTest01 {
    static void main() {
        Carro sienna = new Carro();

        sienna.modelo = "Fiat";
        sienna.velocidadeAtual = 45;
        sienna.acelerar();
        System.out.println("Velocidade depois: " + sienna.velocidadeAtual);


    }
}
