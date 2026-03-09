package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Carro {

    public String modelo;
    public int velocidadeAtual;

    public int acelerar() {
        while (velocidadeAtual < 80) {
            velocidadeAtual++;
        }
        return velocidadeAtual;


    }
}