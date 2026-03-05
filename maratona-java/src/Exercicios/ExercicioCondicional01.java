package Exercicios;

public class ExercicioCondicional01 {
    public static void main(String[] args) {
        int idade = 22;
        double peso = 80;

        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if (idade >= 15 && idade <= 17) {
            System.out.println("Categoria Juvenil");
        } else if (idade > 18) {
            System.out.println("Categoria Adulto");

        } else if (idade > 18 && peso < 90) {
            System.out.println("Categoria Adulto Peso Leve");
        } else if (idade > 18 && peso > 90) {
            System.out.println("Categoria Adulto Peso Pesado");

        }
    }
}
//21/02/2025