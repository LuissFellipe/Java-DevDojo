package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Aluno;

public class AlunoTest01 {
    static void main() {
        Aluno aluno = new Aluno();
        aluno.nome = "Felipe";
        aluno.notas = new double[]{ 7,8,9};
        aluno.imprimeNotas();


    }
}
