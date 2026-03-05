package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main() {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 2, 3, 4, 5};

        calculadora.somaArray(new int[]{1, 2, 3, 4, 5});
        calculadora.somaVarArgs(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5);
    }
}
