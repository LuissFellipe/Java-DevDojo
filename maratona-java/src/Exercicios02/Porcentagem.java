package Exercicios02;

public class Porcentagem {
    static void main() {
        double preco = 90;
        double desconto = 15;

        double total = preco * (desconto/ 100);
        double precoFinal = preco - desconto;
        System.out.println(precoFinal);
    }
}
