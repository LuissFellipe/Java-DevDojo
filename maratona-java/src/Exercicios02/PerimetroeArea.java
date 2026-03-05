package Exercicios02;

public class PerimetroeArea {
    static void main() {

        double raio = 2000;
        double perimetro = 2 * Math.PI * raio;
        double area = Math.PI * raio * raio;

        System.out.printf("Seu resultado do perimetro é: %.2f%n", perimetro);
        System.out.printf("Seu resultado da area é: %.2f%n", area);
    }
}