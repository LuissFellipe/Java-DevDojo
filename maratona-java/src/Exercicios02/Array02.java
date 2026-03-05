package Exercicios02;

public class Array02 {
    static void main() {
        int[] numeros = {12, 5, 8, 10, 15};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma de todos os elementos é: " + soma);
    }
}

