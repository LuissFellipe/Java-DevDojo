public class Incremento {
    public static void main(String[] args) {
        int i = 5;

        // Exemplo de Pós-incremento
        System.out.println("Valor original: " + i);          // 5
        System.out.println("No i++: " + i++);                // Imprime 5, depois vira 6
        System.out.println("Depois do i++: " + i);           // 6

        System.out.println("---");

        // Exemplo de Pré-incremento
        i = 5; // Resetando para 5
        System.out.println("Valor original: " + i);          // 5
        System.out.println("No ++i: " + ++i);                // Vira 6, depois imprime 6
        System.out.println("Depois do ++i: " + i);           // 6
    }
}