package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Cachorro {
    public String nome;
    public int tamanho;

    public void latir (){
        if (tamanho > 60){
            System.out.println("Wooff! Wooff!");
        }else if (tamanho > 14 ){
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
