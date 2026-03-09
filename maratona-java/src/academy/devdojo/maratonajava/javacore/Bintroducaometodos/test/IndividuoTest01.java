package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class IndividuoTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Felipe");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{2000, 4000, 3200});

        funcionario.imprimeMediaSalario();

        System.out.println("Media " + funcionario.getMedia());
    }
}