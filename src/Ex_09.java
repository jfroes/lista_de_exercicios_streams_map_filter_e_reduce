import java.util.Arrays;
import java.util.List;

public class Ex_09 {
//    Exercicio 09: Calcule a média de uma lista de notas (use mapToDouble().average()).
    public static void main(String[] args) {
        List<Double> numeros = Arrays.asList(7.5, 2.3, 8.2, 7.6, 5.6, 6.0, 10.0);

        Double media = numeros.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

        System.out.printf("%.2f",media);

    }

}
