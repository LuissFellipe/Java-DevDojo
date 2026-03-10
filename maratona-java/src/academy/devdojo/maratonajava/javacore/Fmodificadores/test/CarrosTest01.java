package academy.devdojo.maratonajava.javacore.Fmodificadores.test;

import academy.devdojo.maratonajava.javacore.Fmodificadores.dominio.Carros;

public class CarrosTest01 {
    static void main() {
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();
        Carros carro3 = new Carros();
        Carros.setVelocidadeLimite(180);

        carro1.setNome("Fiat");
        carro1.setVelocidadeLimite(170);
        carro1.setVelocidadeMaxima(250);

        carro2.setNome("BMW");
        carro2.setVelocidadeLimite(170);
        carro2.setVelocidadeMaxima(250);


        carro3.setNome("Ferrari");
        carro3.setVelocidadeLimite(170);
        carro3.setVelocidadeMaxima(250);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
