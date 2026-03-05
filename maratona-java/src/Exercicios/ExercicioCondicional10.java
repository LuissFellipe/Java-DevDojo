package Exercicios;

public class ExercicioCondicional10 {
    static void main() {
        byte dia = 5;

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
                System.out.println("Opcao Invalida");
        }

    }
}


// //23/02/26 CONDICIONAL SWITCH