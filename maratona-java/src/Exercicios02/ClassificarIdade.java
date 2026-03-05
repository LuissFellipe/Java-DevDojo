package Exercicios02;

public class ClassificarIdade {
    static void main() {
        int idade = 99;

        if (idade <= 12){
            System.out.println("Crianca");
        } else if( idade > 13 && idade <=17 ){
            System.out.println("Adolescente");
        }else if (idade >=18 && idade <= 59){
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }
    }
}
