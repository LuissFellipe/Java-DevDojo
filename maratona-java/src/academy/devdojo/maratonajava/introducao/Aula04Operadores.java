package academy.devdojo.maratonajava.introducao;


public class Aula04Operadores {
    public static void main(String[] args) {

        int numero1 = 10;
        int numero2 = 30;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % para achar o resto
        int resto = 144 % 7;
        System.out.println(resto);

        // < > <= >= valores boolenaos
        // Comparar igualdades seria ==
        // Diferente !=

        boolean isDEZMaiorQueVinte = 10 > 20;
        boolean isDEZDiferenteQueDez = 10 != 10;
        System.out.println("isDEZMaiorQueVinte  " + isDEZMaiorQueVinte);
        System.out.println("isDEZDiferenteQueDez  " + isDEZDiferenteQueDez);

        // && (AND)
        // || (OR)
        // ! Negacao

        // && (AND)
        int idade = 23;
        float salario = 3000;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMairQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenor QueTrinta " + isDentroDaLeiMenorQueTrinta);

        // || (OR)

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000;


        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);


        // = += -= /= %= serve para facilicar soma,adicao etc
        double bonus = 1800;
        bonus +=100;
        System.out.println(bonus );

        // ++ --
        int contador = 0;
        contador +=1;
        contador++;
        int contador2 = 0;
        System.out.println(++contador2);

        // a ordem altera, seria primeiro conte e depois incremente: contador++
        // a ordem altera, seria primeiro incremente e depois conte: ++contador

    }

}

//22/02/26 TIPOS DE OPERADORES