import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex_01 {
//    Exercicio 01: Crie uma lista de inteiros e use filter() para exibir apenas pares.
    public static void main(String[] args) {
        IntStream stream =  IntStream.rangeClosed(1, 20);
        List<Integer> numeros = stream.boxed().toList();

        numeros.stream().filter(n -> n % 2 == 0).toList().forEach(System.out::println);
    }

}
