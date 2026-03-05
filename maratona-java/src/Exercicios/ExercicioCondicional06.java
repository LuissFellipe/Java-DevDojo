package Exercicios;
//Reajuste Salarial: Leia o salário de um funcionário e calcule o aumento: até R$ 2.000,00 (15%), entre R$ 2.000,01 e R$ 5.000,00 (10%) e acima de R$ 5.000,00 (5%).
public class ExercicioCondicional06 {
    public static void main(String[] args) {

        double salario = 2400;
        double porcentagem = 0;

        if (salario <= 2000){
            porcentagem = 0.15;
        } else if (salario >= 2000.1 && salario <= 50000){
            porcentagem = 0.10;
        }else if (salario >=5000){
            porcentagem = 0.05;

        } double Novosalario = salario+ (salario * porcentagem);
        System.out.println("Seu salário é " + Novosalario);

    }
}
//21/02/2025