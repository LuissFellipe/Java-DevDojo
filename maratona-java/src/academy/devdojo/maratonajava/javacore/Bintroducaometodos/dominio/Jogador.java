package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Jogador {
    private String nome;
    private int energia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int novaEnergia) {
        this.energia = energia;
        if (novaEnergia > 100){
            this.energia = 100;
            System.out.println("Voce está com a vida máxima!");

        }else if (novaEnergia <0){
            this.energia = 0;
            System.out.println("Sua energia é zero! Cuidado!");

        }else if (novaEnergia >0 && novaEnergia <100){
            System.out.println(novaEnergia);
        }
    }
}
