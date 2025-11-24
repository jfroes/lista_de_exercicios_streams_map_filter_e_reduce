import java.util.Arrays;
import java.util.List;

public class Ex_08 {
//    Exercicio 08: Gere uma lista de quadrados dos números.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> quadrados = numeros.stream().map(n -> n * n).toList();

        quadrados.forEach(System.out::println);
    }

}
