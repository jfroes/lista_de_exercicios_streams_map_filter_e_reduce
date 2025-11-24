import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex_18 {
//    Exercicio 18: Use distinct() para eliminar duplicados antes de somar.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 9, 10);

        Integer total = numeros.stream().distinct().reduce(Integer::sum).orElse(0);
        System.out.println(total);
    }
}
