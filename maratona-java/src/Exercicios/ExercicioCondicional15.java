package Exercicios;

public class ExercicioCondicional15 {
    static void main() {

        String mes = "Janeiro";

        switch (mes) {
            default:
                System.out.println("Invalido");
            case "Dezembro":
            case "Janeiro":
            case "Fevereiro":
                System.out.println("Verao");
                break;
            case "Marco":
            case "Abril":
            case "Maio":
                System.out.println("Outono");
                break;

            case "Junho":
            case "Julho":
            case "Agosto":
                System.out.println("Inverno");
                break;

            case "Setembro":
            case "Outubro":
            case "Novembro":
                System.out.println("Primavera");
                break;





        }

    }
}


// 24/02/26