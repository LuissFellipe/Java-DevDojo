package Exercicios02;

public class TrocadeVariaveis {
    public class TrocaVariaveis {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;

            // Passo 1: a armazena a soma de ambos
            a = a + b; // a agora vale 30

            // Passo 2: b subtrai o b original da soma, resultando no a original
            b = a - b; // b agora vale 10

            // Passo 3: a subtrai o novo b (que é o a original) da soma
            a = a - b; // a agora vale 20

            System.out.println("Novo valor de a: " + a);
            System.out.println("Novo valor de b: " + b);
        }
    }
}

// ERREI