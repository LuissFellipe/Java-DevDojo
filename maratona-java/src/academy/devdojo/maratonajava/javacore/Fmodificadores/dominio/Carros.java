package academy.devdojo.maratonajava.javacore.Fmodificadores.dominio;

public class Carros {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;



    public void imprime(){
        System.out.println("-------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade maxima "+ this.velocidadeMaxima);
        System.out.println("Velocidade maxima "+ Carros.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeLimite() {
        return Carros.velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carros.velocidadeLimite = velocidadeLimite;
    }
}
