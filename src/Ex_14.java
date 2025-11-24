import java.util.*;
import java.util.stream.Collectors;

public class Ex_14 {
//    Exercicio 14: Obtenha o produto mais caro (max(Comparator.comparing(...))).
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Caixa de Som JBL", 249.90, "Eletronicos"),
                new Produto("Shampoo", 49.90, "Cosmetico"),
                new Produto("Blusa", 869.90, "Vestuario"),
                new Produto("Vestido", 29.99, "Vestuario"),
                new Produto("Teclado Mecanico", 199.90, "Eletronicos")
        );

        Optional<Produto> maisCaro = produtos.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco)));

        if (maisCaro.isPresent()){
            System.out.println(maisCaro.get().getNome());
        }

    }
}
