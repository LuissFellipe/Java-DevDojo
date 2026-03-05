package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Produtos {
    public String nome;
    public double[] precosHistoricos;

    public void imprimeMaiorPreco() {
        if (precosHistoricos == null || precosHistoricos.length == 0) {
            return;
        }

        double maiorPreco = precosHistoricos[0];

        for (double preco : precosHistoricos) {
            if (preco > maiorPreco) {
                maiorPreco = preco;
            }
        }

        System.out.println("Produto: " + this.nome);
        System.out.println("Maior preço histórico: " + maiorPreco);
    }
} 