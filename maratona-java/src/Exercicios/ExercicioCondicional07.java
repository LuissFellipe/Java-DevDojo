package Exercicios;
// Calculadora de IMC: Receba o peso e a altura, calcule o Índice de Massa Corporal e informe a classificação (Abaixo do peso, Peso normal, Sobrepeso, Obesidade).
public class ExercicioCondicional07 {
    public static void main(String[] args) {
        double peso = 90.0;
        double altura = 1.84; // Altura em metros

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}
//21/02/2025 Dificuldade