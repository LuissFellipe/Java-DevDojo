package Exercicios;

public class ExercicioEstruturadeRepeticao08 {
    static void main() {

        String palavra = "Java é a melhor linguagem";
        int tamanho = palavra.length();

        for (int i = (tamanho - 1); i >= 0; i--) {
            System.out.print(palavra.charAt(i));
        }
    }
}
