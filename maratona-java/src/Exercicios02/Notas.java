package Exercicios02;

public class Notas {
    static void main() {
        double nota = 8.9;

        if (nota >= 9) {
            System.out.println("Conceito A");

        } else if (nota >= 8) {
            System.out.println("Conceito B");
        } else if (nota >= 7) {
            System.out.println("Conceito C");
        } else if (nota >= 6) {
            System.out.println("Conceito D");
        } else if (nota >= 5) {
            System.out.println("Conceito E");

        } else {
            System.out.println("Conceito F");
        }
    }
}