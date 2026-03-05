package Exercicios02;

import java.util.Scanner;

public class Media {
    static void main() {
        double nota = 0;
        double soma = 0;
        int contador = 0;
        Scanner leitor = new Scanner(System.in);


        System.out.println("Digite as notas (ou um número negativo para sair):");

        while (nota >= 0) {
            System.out.print("Nota: ");
            nota = leitor.nextDouble();

            if (nota >= 0) {
                soma += nota;
                contador++;
            }
        }

        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("Soma total: %.2f%n", soma);
            System.out.printf("Média das %d notas: %.2f%n", contador, media);
        } else {
            System.out.println("Nenhuma nota válida foi digitada.");
        }

        leitor.close();
    }
}
