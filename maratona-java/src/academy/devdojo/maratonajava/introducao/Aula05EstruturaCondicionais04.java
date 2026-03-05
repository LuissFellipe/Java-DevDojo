package academy.devdojo.maratonajava.introducao;

//Switch
public class Aula05EstruturaCondicionais04 {
    static void main() {
        // imprima o dia da semana, considerando domingo como dia 1
        // Switch so aceita: char, int, byte, enum, string
        int dia = 5;

        switch (dia) {
            default:
                System.out.println("Opcao invalida");
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terca");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }


    }
}

//23/02/26 CONDICIONAL SWITCH