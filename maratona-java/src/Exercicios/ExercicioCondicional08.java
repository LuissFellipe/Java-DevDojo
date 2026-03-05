package Exercicios;

public class ExercicioCondicional08 {
    public static void main(String[] args) {

        double salario = 40000;

        // Alinhando as taxas conforme a lógica de cálculo decimal
        double imposto1 = 9.7 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;

        double valorImposto;

        if (salario <= 34712) {
            valorImposto = salario * imposto1;
        } else if (salario <= 68507) {
            valorImposto = salario * imposto2;
        } else {
            valorImposto = salario * imposto3;
        }
    }
}

//23/02/2026