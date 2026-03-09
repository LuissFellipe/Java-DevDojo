package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Retangulo;

public class RetanguloTest01 {
    static void main() {
        Retangulo retangulo = new Retangulo();
        retangulo.base = 20;
        retangulo.altura = 30;
        System.out.println("A base é: " + retangulo.base);
        System.out.println("A altura é: " + retangulo.altura);

    }
}