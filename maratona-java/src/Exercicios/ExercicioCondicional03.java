package Exercicios;
/* Classificação de Idade: Peça a idade de uma pessoa e exiba se ela é

Criança (0-12),
Adolescente (13-17),
Adulta (18-59)
Idosa (60+).
 */
public class ExercicioCondicional03 {
    public static void main(String[] args) {
        int idade = 22;

        if (idade < 12){
            System.out.println("Voce é uma crianca");
        } else if (idade >12 && idade <=17){
            System.out.println("Voce é um adolescente");
        } else if (idade >17 && idade <= 59){
            System.out.println("Voce é um adulto");
        }else if (idade >60){
            System.out.println("Voce é idoso");
        }

    }
}
//21/02/2025