import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex_11 {
//    Exercicio 11: Crie uma lista de números e conte quantos são múltiplos de 3.
    public static void main(String[] args) {
        List<Integer> numeros = IntStream.rangeClosed(1, 10).boxed().toList();

        long multiplosDeTres = numeros.stream().filter(n -> n % 3 == 0).count();

        System.out.println(multiplosDeTres);
    }
}
