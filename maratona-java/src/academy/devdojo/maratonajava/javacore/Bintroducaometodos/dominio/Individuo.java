package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Individuo {

    private String nome;
    private int idade;

    public void fazerAniversario() {
        this.idade = this.idade + 1;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}