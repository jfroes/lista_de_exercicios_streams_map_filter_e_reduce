import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_13 {
//    Exercicio 13: Agrupe uma lista de produtos por categoria (Collectors.groupingBy).
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Caixa de Som JBL", 249.90, "Eletronicos"),
                new Produto("Shampoo", 49.90, "Cosmetico"),
                new Produto("Blusa", 869.90, "Vestuario"),
                new Produto("Vestido", 29.99, "Vestuario"),
                new Produto("Teclado Mecanico", 199.90, "Eletronicos")
        );

        Map<String, List<Produto>> porCategoria = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));

        porCategoria.forEach((categoria, list) ->{
            System.out.print(categoria + ": ");
            list.forEach(p -> System.out.print(p.getNome() + ","));
            System.out.println();

        });


    }
}
