import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Ex_04 {
//    Exercicio 04: Converta uma lista de strings para maiúsculas usando map().
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("banana", "maçã", "pera", "uva");

        nomes.stream().map(String::toUpperCase).forEach(System.out::println);
    }

}
