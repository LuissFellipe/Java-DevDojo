package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome;
    private Time time;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
public void imprime(){
    System.out.println(this.nome);
    if (jogadores == null) return;
    for (Jogador jogador: jogadores);

}

    public Time(String nome, Time time, Jogador[] jogadores) {
        this.nome = nome;
        this.time = time;
        this.jogadores = jogadores;
    }
}
