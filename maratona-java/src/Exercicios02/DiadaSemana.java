package Exercicios02;

public class DiadaSemana {
    static void main() {
        int dia =1;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de Semana");
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
