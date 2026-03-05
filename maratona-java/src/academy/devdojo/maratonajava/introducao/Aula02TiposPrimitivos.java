package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        /* Tipos Primitivos
            byte    = Inteiro de 8 bits (Valores de -128 a 127)
           short   = Inteiro de 16 bits (Valores de -32.768 a 32.767)
           int     = Inteiro de 32 bits (Números inteiros padrão)
           long    = Inteiro de 64 bits (Para valores numéricos extensos)
           float   = Número real de precisão simples (32 bits IEEE 754)
           double  = Número real de precisão dupla (64 bits IEEE 754)
            boolean = Valor lógico (true ou false)
            char    = Único caractere Unicode de 16 bits
         */

        int idade = 10;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = -128;
        short idadeShort = 10;
        boolean Verdadeiro = true;
        boolean Falso = false;
        char caractere = 10;
        String nome = "felipe";

        System.out.println("A idade referida é " + idade);
        System.out.println(Verdadeiro);
        System.out.println("OLa meu nome e "+ nome );

    }
}

//22/02/26 INTRODUCAO A TIPOS PRIMITIVOS