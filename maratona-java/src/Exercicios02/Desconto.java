package Exercicios02;

public class Desconto {
    static void main() {
        double compra = 100;
        double desconto = 0;

        if (compra <= 100){
            desconto = compra *  0.05;
        } else if (compra >= 100 && compra < 500){
            desconto = compra * 0.10;
        } else if (compra > 500 ){
            desconto = compra * 0.15;
         }double valorTotal = compra - desconto;
        System.out.println(valorTotal);
    }
}
