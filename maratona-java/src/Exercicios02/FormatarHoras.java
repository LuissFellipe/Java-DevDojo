package Exercicios02;

public class FormatarHoras {
    static void main() {
        int totalSegundos = 3665;
        int horas = totalSegundos / 3600;
        int restoSegundos = totalSegundos % 3600;

        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);

    }
}
