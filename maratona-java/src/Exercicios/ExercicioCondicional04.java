package Exercicios;
// Maior de Três: Leia três números inteiros e identifique qual deles é o maior.
public class ExercicioCondicional04 {
    public static void main(String[] args) {

        Integer A = 10;
        Integer B = 240;
        Integer C = 55;

         if (A >= B && A >= C) {
            System.out.println("O maior numero é A: " + A);
        } else if (B >= A && B >= C) {
            System.out.println("O maior numero é B: " + B);
        } else {
            System.out.println("O maior numero é C: " + C);
        }
    }
}

// Senti dificuldade nesse. 21/02/2025