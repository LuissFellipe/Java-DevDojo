package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Computador {
    private String marca;
    private int memoriaRam;

    public Computador(String marca) {
        this.marca = marca;
        this.memoriaRam = 8;
    }

    public Computador(String marca, int memoriaRam) {
        this.marca = marca;
        this.memoriaRam = memoriaRam;
    }

    public void imprimirConfig(){
        System.out.println("Configuração: " + this.marca + " com " + this.memoriaRam + "GB de RAM.\n");
    }
}
