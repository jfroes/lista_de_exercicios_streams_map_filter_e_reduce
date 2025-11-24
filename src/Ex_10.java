import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex_10 {
//    Exercicio 10: Filtre e ordene uma lista de produtos por preço.
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Caixa de Som JBL", 249.90, "Eletronicos"),
                new Produto("Fone com Microfone", 49.90, "Eletronicos"),
                new Produto("Placa Mae", 869.90, "Eletronicos"),
                new Produto("Mouse Optico", 29.99, "Eletronicos"),
                new Produto("Teclado Mecanico", 199.90, "Eletronicos")
        );

        produtos.stream().sorted(Comparator.comparing(Produto::getPreco)).forEach(p -> System.out.println(p.getPreco()));
    }

}
