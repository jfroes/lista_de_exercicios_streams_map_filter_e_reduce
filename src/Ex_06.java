import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_06 {
//    Exercicio 06: Filtre nomes que comecem com “A”
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("banana", "Ameixa", "maçã", "pera", "Abacate",  "uva", "Amora");

        nomes.stream().filter(n -> n.startsWith("A")).forEach(System.out::println);
    }

}
