import java.util.Arrays;
import java.util.List;

public class Ex_07 {
//    Exercicio 07: Conte quantos nomes têm mais de 5 letras.
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("banana", "Ameixa", "maçã", "pera", "Abacate",  "uva", "Amora");

        long qtd = nomes.stream().filter(n -> n.length() > 5).count();

        System.out.println(qtd);
    }

}
