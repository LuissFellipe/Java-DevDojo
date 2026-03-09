package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Retangulo {
    public double base;
    public double altura;

    public double calcularArea(){
        return base * altura;
    }
    public double perimetro() {
        return (base * 2) + (altura * 2);

    }

}
