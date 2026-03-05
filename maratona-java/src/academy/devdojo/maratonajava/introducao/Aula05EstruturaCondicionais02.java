package academy.devdojo.maratonajava.introducao;
// idade < 15 categoria infantil
// idade >= 15 && idade < 18 categoria juvenil
// idade >= 18 categoria adulto
public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade = 33;
        String categoria = "";

        if (idade < 15){
            categoria = "categoria infantil";
        } else if (idade >=15 && idade < 18){
            categoria = "categoria juvenil";
        }else if (idade >= 18){
            categoria = "categoria adulto";
        }
        System.out.println(categoria);
    }
}

// 22/02/2026 CONDICIONAL ELSE IF