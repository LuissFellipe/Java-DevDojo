package Exercicios02;

public class MaiordeTres {
    static void main() {
        double a = 1;
        double b = 26;
        double c = 3;

        if ( a >= b && a >= c){
            System.out.println("C é maior");
        } else if (b >= a && b >= c){
            System.out.println("B é maior");

        } else System.out.println("A é maior");
    }
}
