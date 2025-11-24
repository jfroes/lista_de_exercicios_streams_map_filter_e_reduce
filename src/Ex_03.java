import java.util.List;
import java.util.stream.IntStream;

public class Ex_03 {
//    Exercicio 03: Multiplique todos os elementos com reduce().
    public static void main(String[] args) {
        IntStream stream =  IntStream.rangeClosed(1, 10);
        List<Integer> numeros = stream.boxed().toList();

        int result = numeros.stream().reduce(1, (acc, n) -> acc * n);
        System.out.println(result);
    }

}
