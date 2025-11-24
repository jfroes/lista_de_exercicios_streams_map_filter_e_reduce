import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex_17 {
//    Exercicio 17: Gere uma lista de números aleatórios e filtre > 50.
    public static void main(String[] args) {
        Random random = new Random();
        IntStream stream = random.ints(20, 1 ,70);

        List<Integer> numeros = new ArrayList<>(stream.boxed().toList());

        numeros.stream().filter(n -> n > 50).forEach(System.out::println);

    }
}
