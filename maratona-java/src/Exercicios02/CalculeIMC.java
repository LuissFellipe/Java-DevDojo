package Exercicios02;

public class CalculeIMC {
    static void main() {
        double peso = 89;
        double altura = 1.85;
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);
    }
}
