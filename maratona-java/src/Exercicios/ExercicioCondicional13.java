package Exercicios;

public class ExercicioCondicional13 {
    static void main() {
        String cinema = "Quinta";
        boolean estudante = true;

        String tipoBilhete = (cinema.equalsIgnoreCase("Terça") || estudante) ? "Meia-entrada" : "Inteira";
        System.out.println(tipoBilhete);


    }
;}


// 23/02