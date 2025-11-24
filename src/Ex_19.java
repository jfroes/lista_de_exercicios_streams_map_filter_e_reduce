import java.util.Arrays;
import java.util.List;

public class Ex_19 {
//    Exercicio 19: Combine map() e filter() para normalizar e limpar dados.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 9, 10);

        numeros.stream().distinct().filter(n -> n % 2 != 0).map(n -> n * 2).forEach(System.out::println);
    }
}
