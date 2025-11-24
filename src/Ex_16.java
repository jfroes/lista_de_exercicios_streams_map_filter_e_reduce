import java.util.*;
import java.util.stream.IntStream;

public class Ex_16 {
//    Exercicio 17: Gere uma lista de números aleatórios e filtre > 50.
    public static void main(String[] args) {
        Random random = new Random();
        IntStream stream = random.ints(20, 1 ,70);

        List<Integer> numeros = new ArrayList<>(stream.boxed().toList());

        numeros.stream().filter(n -> n > 50).forEach(System.out::println);

    }
}
