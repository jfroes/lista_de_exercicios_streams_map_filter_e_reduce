import java.util.List;
import java.util.stream.IntStream;

public class Ex_02 {
//    Exercicio 02: Some todos os valores com reduce().
    public static void main(String[] args) {
        IntStream stream =  IntStream.rangeClosed(1, 20);
        List<Integer> numeros = stream.boxed().toList();

        int result = numeros.stream().reduce(Integer::sum).orElse(0);
        System.out.println(result);
    }

}
