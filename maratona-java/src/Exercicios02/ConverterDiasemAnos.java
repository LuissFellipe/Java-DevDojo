package Exercicios02;

public class ConverterDiasemAnos {
    static void main() {

        double dias = 3635;
        double diasNoAno = 365;
        double anos = dias / diasNoAno;
        System.out.printf("Seus %.0f dias equivalem a %.2f anos%n", dias, anos);
    }
}