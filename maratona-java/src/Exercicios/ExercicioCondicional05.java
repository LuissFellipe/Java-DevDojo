package Exercicios;

// Cálculo de Média Escolar: Receba quatro notas, calcule a média e informe: "Aprovado" (média >= 7), "Recuperação" (média entre 5 e 6.9) ou "Reprovado" (média < 5).
public class ExercicioCondicional05 {
    public static void main(String[] args) {
        double nota1 = 9;
        double nota2 = 2;
        double nota3 = 9;
        double nota4 = 9;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >=7){
            System.out.println("Aprovado! " + media);
        }else if (media <= 5 && media <=6.9){
            System.out.println("Recuperacao " + media);
        }else if (media >5){
            System.out.println("Reprovado " + media);
        }
    }
}

//23/02/2026