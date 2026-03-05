package Exercicios02;

public class Imposto {
    static void main() {
        double rendimento = 3000;
        double imposto;

        if (rendimento <= 34000) {
            imposto = rendimento * 0.097;
        } else {
            imposto = rendimento * 0.3735;
        }
        System.out.printf("O valor do imposto na Holanda é: € %.2f%n", imposto);

    }


}

