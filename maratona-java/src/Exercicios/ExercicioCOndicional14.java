package Exercicios;
//Alerta de Stock de Segurança
// (condicao) ? true : false
public class ExercicioCOndicional14 {
    static void main() {
        double produto = 99;

        String statusStock = (produto < 100)?  "ATENCAO! Sem Stock Minimo ": "Stock Minimo OK";
        System.out.println(statusStock);
    }
}


