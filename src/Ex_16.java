import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex_16 {
//    Exercicio 16: Crie um pipeline que filtra, mapeia e reduz em uma soma final.
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer soma = numeros.stream().filter(n -> n % 2 == 0).map(n-> n * 3).reduce(Integer::sum).orElse(0);
        System.out.println(soma);
    }
}
