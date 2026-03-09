package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main() {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Felipe");
        pessoa.setIdade (22);
        pessoa.imprime();
        System.out.println(pessoa.getNome());
    }
}
