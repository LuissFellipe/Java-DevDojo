package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Produtos;

public class ProdutosTest01 {
    static void main() {
        Produtos produtos = new Produtos();
        produtos.nome = "Monitor Gamer";
        produtos.precosHistoricos = new double[]{1200.50, 1500.00, 1100.90, 1850.00};
        produtos.imprimeMaiorPreco();

    }
}
