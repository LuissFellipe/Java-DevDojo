package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main() {
        Funcionario funcionario = new Funcionario();
        funcionario.nome =  "Felipe";
        funcionario.idade =  22;
        funcionario.salarios = new double[]{2000, 4000, 3200};
        funcionario.imprimeMediaSalario();
    }





}
