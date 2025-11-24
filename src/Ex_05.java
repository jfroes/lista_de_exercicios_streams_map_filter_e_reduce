import java.util.Arrays;
import java.util.List;

public class Ex_05 {
//    Exercicio 05: Concatene todos os nomes com reduce() em uma única string.
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("banana", "maçã", "pera", "uva");

        String unica = nomes.stream().reduce(String::concat).orElse("");

        String unica2 = nomes.stream().reduce("", (acc, s) -> acc.concat(s));


        System.out.println(unica2);
    }

}
