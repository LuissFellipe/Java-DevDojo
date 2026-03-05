package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Aluno {
    public String nome;
    public double[] notas;

    public void imprimeNotas() {
        if (notas == null) {
            return;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Aluno: " + this.nome);
        System.out.println("Média: " + media);

        if (media >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}