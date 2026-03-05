package Exercicios;

public class ExercicioCondicional12 {
    static void main() {
        double compra = 2303;
        // (condicao)? vdd : false
        String frete = (compra > 250) ? "Frete Grátis" : "Frete Pago";
        System.out.println(frete);
    }
}

