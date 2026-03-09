package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Banco {
    private int senhaCofre = 12345;

    private class FuncionarioConfianca {
        public void acessarCofre() {
            System.out.println("A senha do cofre é: " + senhaCofre);
        }

    }

    public void iniciarTrabalho() {
        FuncionarioConfianca func = new FuncionarioConfianca();
        func.acessarCofre();


    }
}
