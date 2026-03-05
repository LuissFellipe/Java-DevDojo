package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main() {
        Carro carro1 = new Carro();
        carro1.nome = "Toro";
        carro1.modelo = "Fiat";
        carro1.ano = 2019;

        Carro carro2 = new Carro();
        carro2.nome = "Sienna";
        carro2.modelo = "Fiat";
        carro2.ano = 2012;

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

        System.out.println("----");

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);




    }
}
