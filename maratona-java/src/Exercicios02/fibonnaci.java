package Exercicios02;

public class fibonnaci {
    static void main() {
        int n = 10;
        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Os primeiros " + n + " números da sequência de Fibonacci:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}


